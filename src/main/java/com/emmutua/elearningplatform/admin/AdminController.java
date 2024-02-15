package com.emmutua.elearningplatform.admin;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin/")
@PreAuthorize("hasRole('ADMIN')")
public class AdminController {
    @GetMapping("")
    @PreAuthorize("hasAnyAuthority('admin:read')")
    public ResponseEntity<Object> getContent(){
        return ResponseEntity.ok().body("Get");
    }

    @PostMapping("")
    @PreAuthorize("hasAnyAuthority('admin:post')")
    public ResponseEntity<Object> postContent(){
        return ResponseEntity.ok().body("Post");
    }

    @PutMapping("")
    @PreAuthorize("hasAnyAuthority('admin:update')")
    public ResponseEntity<Object> putContent(){
        return ResponseEntity.ok().body("Update");
    }

    @DeleteMapping("")
    @PreAuthorize("hasAnyAuthority('admin:delete')")
    public ResponseEntity<Object> deleteContent(){
        return ResponseEntity.ok().body("Delete");
    }
}

