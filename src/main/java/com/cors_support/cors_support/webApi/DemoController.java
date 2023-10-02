package com.cors_support.cors_support.webApi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @GetMapping(value = "/string")
  //@CrossOrigin(origins = "http://localhost:8081")
  public ResponseEntity<String> getString() {
    return new ResponseEntity<>("This is a Demo", HttpStatus.OK);
  }

}
