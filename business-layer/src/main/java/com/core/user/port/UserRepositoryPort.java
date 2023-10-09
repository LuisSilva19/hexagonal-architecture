package com.core.user.port;

import com.core.user.domain.User;

public interface UserRepositoryPort {
    User save(User user);

    User retrieveUserById(Long id);
}
