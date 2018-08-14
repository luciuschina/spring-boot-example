## 重要的知识点

#### swagger管理页面
http://localhost:8080/swagger-ui.html


#### 可执行jar包的启动命令
java -jar /data/work/luciuschina/spring-boot-example/target/spring-boot-example-0.0.1-SNAPSHOT.jar --spring.config.name=application --spring.config.location=file:/data/work/luciuschina/spring-boot-example/src/main/resources/config/

或者：

java -jar /data/work/luciuschina/spring-boot-example/target/spring-boot-example-0.0.1-SNAPSHOT.jar \
--spring.config.location=file:/data/work/luciuschina/spring-boot-example/src/main/resources/config/application.properties

注意：在spring.config.location中可以指定文件或者目录，如果是目录必须以 / 结尾



------------------------------------


## 参考资料

#### JPA
https://medium.com/@joeclever/using-multiple-datasources-with-spring-boot-and-spring-data-6430b00c02e7

https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#howto-configure-a-datasource

https://www.ccampo.me/java/spring/2016/02/13/multi-datasource-spring-boot.html


#### jdbc connection pool
https://threadminions.com/2017/12/25/spring-boot-with-different-connection-pooling/

#### 使用@ConfigurationProperties的例子
https://www.mkyong.com/spring-boot/spring-boot-configurationproperties-example/