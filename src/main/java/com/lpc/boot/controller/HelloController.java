package com.lpc.boot.controller;

import com.lpc.boot.config.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lpc
 * @create 2021-08-08 11:31
 */
@RestController
public class HelloController {

    @Autowired
    private Person person;

    @RequestMapping("/hello")
    public Person hello() {
        return person;
    }

}
