package com.core.user.port;

import com.core.user.domain.User;

public interface UserFacadePort {
    User retrieveUserById(Long id);
}
