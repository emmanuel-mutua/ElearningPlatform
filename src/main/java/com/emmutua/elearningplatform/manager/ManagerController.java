package com.emmutua.elearningplatform.manager;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/management/")
public class ManagerController {
    @GetMapping("")
    public ResponseEntity<Object> getContent(){
        return ResponseEntity.ok().body("Get");
    }

    @PostMapping("")
    public ResponseEntity<Object> postContent(){
        return ResponseEntity.ok().body("Post");
    }

    @PutMapping("")
    public ResponseEntity<Object> putContent(){
        return ResponseEntity.ok().body("Update");
    }

    @DeleteMapping("")
    public ResponseEntity<Object> deleteContent(){
        return ResponseEntity.ok().body("Delete");
    }
}
