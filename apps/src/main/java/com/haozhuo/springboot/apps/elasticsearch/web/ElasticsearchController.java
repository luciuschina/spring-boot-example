package com.haozhuo.springboot.apps.elasticsearch.web;

import com.haozhuo.springboot.apps.elasticsearch.service.ElasticsearchBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lucius on 8/14/18.
 */
@RestController
@RequestMapping(value = "/es")
public class ElasticsearchController {
    @Autowired
    ElasticsearchBean esBean;
    @GetMapping("/get_title")
    public String getTitle(@RequestParam(value = "id") String id) {
        return esBean.getArticleTitleById(id);
    }
}
