package com.rawsanj.restdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rawsanj.restdemo.entity.SearchVO;

@RestController
@SpringBootApplication
public class RestControllerDemoApplication {
	
	@RequestMapping(value = "/searchUser", method = RequestMethod.POST)
    public SearchVO searchUser(@RequestBody SearchVO user) {
        System.out.println(user.toString());
        return user;
    }

    @RequestMapping(value = "/getSearchUser", method = RequestMethod.GET)
    public SearchVO getSearchUser() {
        SearchVO user = new SearchVO();
        user.setNickname("@RawSanj");
        user.setEmpid("XYZ00123");
        user.setEmail("winteriscoming@gmail.com");
        user.setPhone("9876543210");
        System.out.println(user.toString());
        return user;
    }

	public static void main(String[] args) {
		SpringApplication.run(RestControllerDemoApplication.class, args);
	}
}
