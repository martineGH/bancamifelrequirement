package com.bmr.bancamifelrequirement.controller;

import java.util.Map;
import java.util.Collections;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorizedController {
  @GetMapping("/authorized")
  public Map<String, String> authorized(@RequestParam String code){
    return Collections.singletonMap("code", code);
  }
}
