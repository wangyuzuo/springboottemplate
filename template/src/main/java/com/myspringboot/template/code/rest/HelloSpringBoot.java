package com.myspringboot.template.code.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @Description: java类作用描述
 * @Package: com.myspringboot.template.code.rest
 * @ClassName: HelloSpringBoot
 * @Author: wanggang
 * @CreateDate: 2020/12/27 16:41
 * @Version: 1.0
 */
@RestController()
@RequestMapping("/test")
public class HelloSpringBoot {

    @GetMapping("/hello")
    public MultiValueMap helloSpringBoot(){
        MultiValueMap<String, String> headers = new LinkedMultiValueMap();
        headers.add("ttt", "hello");

        return headers;
    }
}
