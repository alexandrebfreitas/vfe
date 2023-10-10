package com.valorfuturoenergia.vfe.resources;

import com.valorfuturoenergia.vfe.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findall(){
        User u = new User(1L,"Maria","maria@gmail.com","988888888" , "99999999");
        return ResponseEntity.ok().body(u);
    }
}
