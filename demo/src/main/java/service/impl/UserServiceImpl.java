package service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import pojo.User;
import service.UserService;
import lombok.NonNull;
import org.springframework.stereotype.Component;


@Component
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User saveUser(@NonNull User user) {
        System.out.println("+user.toString(): "+user.toString());
        System.err.println("+user.toString(): "+user.getUserName());
        user.setAuthor("张三");
        user.setTitle("今天星期四了");
        return user;
    }
}
