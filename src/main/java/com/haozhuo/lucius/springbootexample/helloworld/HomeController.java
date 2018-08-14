package com.haozhuo.lucius.springbootexample.helloworld;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by root on 8/3/18.
 */
@RestController
@EnableAutoConfiguration
public class HomeController {
    @RequestMapping("/")
    String home() {
        return "This is HOME";
    }
}
