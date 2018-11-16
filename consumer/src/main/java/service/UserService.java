package service;

import org.springframework.stereotype.Service;
import pojo.User;

@Service
public interface UserService {
    User saveUser(User user);
}
