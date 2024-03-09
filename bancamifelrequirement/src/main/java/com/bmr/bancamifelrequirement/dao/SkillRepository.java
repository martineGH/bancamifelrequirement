package com.bmr.bancamifelrequirement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bmr.bancamifelrequirement.entity.Skill;

public interface SkillRepository extends JpaRepository<Skill, Integer> {

    List<Skill> findByName(String name);
    
}
