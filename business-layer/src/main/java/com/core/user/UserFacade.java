package com.core.user;

import com.core.user.port.UserFacadePort;
import com.core.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserFacade implements UserFacadePort {

    private final UserService userService;

    @Override
    public User retrieveUserById(Long id) {
        return userService.retrieveUserById(id);
    }

}
