package com.stachlabs.app.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    UserController( UserService userService ){
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers( ){
        return ResponseEntity.ok( userService.findAll() );
    }

    @GetMapping( "/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id){
        return ResponseEntity.ok( userService.find( id) );
    }

    @PostMapping( "/create")
    public ResponseEntity<Long> createUser(@RequestBody User user ){
        return ResponseEntity.ok( userService.createUser( user ) );
    }


}
