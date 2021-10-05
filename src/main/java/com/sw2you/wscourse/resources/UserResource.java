package com.sw2you.wscourse.resources;

import com.sw2you.wscourse.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L, "Carlos", "carlos@gmail.com",
                "99111-0089", "12345");
        return  ResponseEntity.ok().body(user);
    }
}
