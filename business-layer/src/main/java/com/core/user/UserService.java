package com.core.user;

import com.core.user.domain.User;
import com.core.user.port.UserRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepositoryPort userRepositoryPort;

    public User createUser(String username) {
        return userRepositoryPort.save(new User(null, username));
    }

    public User retrieveUserById(Long id) {
        return userRepositoryPort.retrieveUserById(id);
    }
}
