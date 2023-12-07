package com.stachlabs.app.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    UserService( UserRepository userRepository ){
        this.userRepository = userRepository;
    }

    public Long createUser( User user ){
      User createdUser = userRepository.save( user );
      return createdUser.getId();
    }

    public User find( Long id ){
        return userRepository.findById( id )
                .orElse( new User() );
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }
}
