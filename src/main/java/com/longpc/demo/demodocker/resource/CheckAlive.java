package com.longpc.demo.demodocker.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/check")
public class CheckAlive {
    @GetMapping
    public ResponseEntity check(){
        return ResponseEntity.ok().body("alive");
    }
}
