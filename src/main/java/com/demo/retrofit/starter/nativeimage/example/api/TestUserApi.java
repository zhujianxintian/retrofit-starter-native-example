package com.demo.retrofit.starter.nativeimage.example.api;

import com.demo.retrofit.starter.nativeimage.example.pojo.UserInfo;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestUserApi {

    @GetMapping("/user")
    public UserInfo getUserInfo(String id) {
        if (!"1".equals(id)) {
            return null;
        }

        UserInfo userInfo = new UserInfo();

        userInfo.setId(id);
        userInfo.setName("test");

        return userInfo;
    }

}
