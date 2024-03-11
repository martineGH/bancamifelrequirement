package com.bmr.bancamifelrequirement.controller;

import java.util.List;
import java.util.Map;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bmr.bancamifelrequirement.dao.SkillRepository;
import com.bmr.bancamifelrequirement.entity.Skill;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class SkillController {
  @Autowired
  private SkillRepository skillRepository;

  @PostMapping("/api/saveSkill")
  public String saveSkills(@RequestBody Skill skill){
    skillRepository.save(skill);
    return "Skill saved";
  }

  @GetMapping("/api/getSkills")
  public List<Skill> getAll(){
    return skillRepository.findAll();
  }

  @GetMapping("/api/getSkills/{name}")
  public List<Skill> getSkillsByName(@PathVariable String name){
    return skillRepository.findByName(name);
  }

  @GetMapping("/authorized")
  public Map<String, String> authorized(@RequestParam String code){
    return Collections.singletonMap("code", code);
  }
}
