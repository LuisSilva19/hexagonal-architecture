package com.application.controller;

import com.application.dto.UserDto;
import com.core.user.domain.User;
import com.core.user.port.UserFacadePort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserFacadePort userFacadePort;
    public UserController(UserFacadePort userFacadePort) {
        this.userFacadePort = userFacadePort;
    }

    @GetMapping("/{id}")
    UserDto retrieveUser(@PathVariable Long id) {
        User user = userFacadePort.retrieveUserById(id);
        return new UserDto(user.id(), user.userName());
    }

    @GetMapping
    void getUser(){
        System.out.println("bateu");
    }

}
