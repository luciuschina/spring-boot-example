## 重要的知识点

#### swagger管理页面
http://localhost:8080/swagger-ui.html

#### eureka-server和zuul-router都起来后，使用下面url就可以访问了
访问swagger：
http://192.168.109.3:9998/swagger-ui.html
其他人调用：
http://192.168.109.3:5555/myapps/hello/greeting


#### 可执行jar包的启动命令
java -jar /data/work/luciuschina/spring-boot-example/target/spring-boot-example-0.0.1-SNAPSHOT.jar --spring.config.name=application --spring.config.location=file:/data/work/luciuschina/spring-boot-example/src/main/resources/config/

或者：

java -jar /data/work/luciuschina/spring-boot-example/target/spring-boot-example-0.0.1-SNAPSHOT.jar --spring.config.location=file:/data/work/luciuschina/spring-boot-example/src/main/resources/config/application.properties

注意：在spring.config.location中可以指定文件或者目录，如果是目录必须以 / 结尾

#### application.properties中的参数可以从以下网址查看：
https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#appendix


------------------------------------


## 参考资料

https://docs.spring.io/spring-boot/docs/current/reference/html

#### JPA
https://medium.com/@joeclever/using-multiple-datasources-with-spring-boot-and-spring-data-6430b00c02e7

https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#howto-configure-a-datasource

https://www.ccampo.me/java/spring/2016/02/13/multi-datasource-spring-boot.html


#### jdbc connection pool
https://threadminions.com/2017/12/25/spring-boot-with-different-connection-pooling/

#### 使用@ConfigurationProperties的例子
https://www.mkyong.com/spring-boot/spring-boot-configurationproperties-example/

#### redis 参考
https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-connecting-to-redis

http://www.cnblogs.com/lchb/articles/7222870.html

https://www.concretepage.com/spring-4/spring-data-redis-example

http://www.cnblogs.com/yjmyzz/p/how-to-inject-multi-redis-instance-in-spring-boot.html

#### kafka参考
https://memorynotfound.com/spring-kafka-and-spring-boot-configuration-example/
https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-kafka-sending-a-message

#### elasticsearch参考
https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-connecting-to-elasticsearch-spring-data

#### spring cloud参考
https://cloud.spring.io/spring-cloud-netflix/spring-cloud-netflix.html
https://www.cnblogs.com/happyflyingpig/p/7955883.html

zuul
https://cloud.spring.io/spring-cloud-netflix/multi/multi__router_and_filter_zuul.html

