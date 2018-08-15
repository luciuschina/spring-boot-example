package com.haozhuo.springboot.apps.helloworld.model;

import lombok.Setter;
import lombok.Getter;


/**
 * Created by root on 8/3/18.
 */
@Setter
@Getter
public class Greeting {
    private String version;
    private String id;
    private String content;
    public Greeting(String id, String content, String version) {
        this.id = id;
        this.content = content;
        this.version = version;
    }

}
