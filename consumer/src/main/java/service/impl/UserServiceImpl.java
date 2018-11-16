package service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import lombok.NonNull;
import org.springframework.stereotype.Service;
import pojo.User;
import service.UserService;

@Service
public class UserServiceImpl{

    @Reference
    private UserService service;

    public User saveUser(@NonNull User user) {
        return service.saveUser(user);
    }
}
