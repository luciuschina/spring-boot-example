package com.haozhuo.springboot.apps.redis.model;

/**
 * Created by Lucius on 8/16/18.
 */
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by Lucius on 8/16/18.
 */
@Getter
@Setter
public class Params implements Serializable {
    private static final long serialVersionUID = 1L;
    private String key;
    private String value;
}
