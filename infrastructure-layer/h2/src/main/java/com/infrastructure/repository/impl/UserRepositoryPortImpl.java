package com.infrastructure.repository.impl;

import com.core.user.port.UserRepositoryPort;
import com.infrastructure.entity.UserEntity;
import com.core.domain.ApplicationException;
import com.core.domain.ErrorCodeEnum;
import com.core.user.domain.User;
import com.infrastructure.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserRepositoryPortImpl implements UserRepositoryPort {

    private final UserRepository userRepository;

    public UserRepositoryPortImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(user.userName());
        userEntity = userRepository.save(userEntity);
        return new User(userEntity.getId(), userEntity.getUsername());
    }

    @Override
    public User retrieveUserById(Long id) {
        return userRepository.findById(id)
            .map(userEntity -> new User(userEntity.getId(), userEntity.getUsername()))
            .orElseThrow(() -> new ApplicationException(ErrorCodeEnum.USER_NOT_FOUND, String.format("User was not found with id: %s", id)));
    }

}
