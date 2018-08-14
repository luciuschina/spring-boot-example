package com.haozhuo.lucius.springbootexample.elasticsearch.service;

import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ElasticsearchBean {

    /**
     * 除了使用TransportClient 还可以使用ElasticsearchTemplate
     * 这两种都是官网推荐的方式。
     * 由于我对TransportClient比较熟悉，所以这里采用TransportClient的方式。
     * 请参考：https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-connecting-to-elasticsearch-spring-data
     */
    @Autowired
    private TransportClient template;

    public String getArticleTitleById(String id) {
        GetResponse response = template.prepareGet("article", "docs", id).get();
        if (response.isExists()) {
            return response.getSource().get("title").toString();
        } else {
            return "该文章不存在";
        }
    }

}
