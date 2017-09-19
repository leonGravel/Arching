package com.arching.controller;
import javax.servlet.http.HttpServletRequest;

import com.arching.dao.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by leebr on 2017/9/19.
 */
@RestController
public class HelloController {

    @Autowired
    private userMapper uMapper;
    @RequestMapping("/")
    String home() {
        System.out.print(uMapper.getUser(1));
        return "Hello World!";
    }

    @RequestMapping("/hello")
    public String greeting(HttpServletRequest request) {
        return "hello";
    }
}
