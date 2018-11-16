package com.example.consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pojo.User;
import service.impl.UserServiceImpl;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsumerApplicationTests {

	@Autowired
	private UserServiceImpl userService;

	@Test
	public void contextLoads() {
		User user=new User();
		user.setUserName("liuruilin");
		user.setPassword("123456");
		userService.saveUser(user);

		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
