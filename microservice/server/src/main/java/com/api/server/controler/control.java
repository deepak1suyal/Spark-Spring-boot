package com.api.server.controler;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class control {
  @GetMapping("/greet")
  public String getMethodName() {
      return "Happy Dewaali";
  }
    
}
