package com.haozhuo.lucius.springbootexample.helloworld;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

/**
 * In Spring’s approach to building RESTful web services, HTTP requests are handled by a controller.
 * These components are easily identified by the @RestController annotation, and the JpaController
 * below handles GET requests for /users/greeting by returning a new instance of the Greeting class
 *
 */
@RestController
@RequestMapping(value="/hello")
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @Autowired
    private Environment environment;

    //@Value必须用在Service、 Controller或者Component层。
    //如果application.properties中找不到my.version,默认设置为0.01
    @Value("${my.version:0.01}")
    private String version;

    /**
     * The @RequestMapping annotation ensures that HTTP requests to /greeting are mapped to the greeting() method.
     *
     * This example does not specify GET vs. PUT, POST, and so forth, because @RequestMapping maps all
     * HTTP operations by default. Use @RequestMapping(method=GET) to narrow this mapping.
     *
     * @RequestParam binds the value of the query string parameter name into the name parameter of the greeting() method.
     * If the name parameter is absent in the request, the defaultValue of "World" is used.
     *
     * A key difference between a traditional MVC controller and the RESTful web service controller is the way that
     * the HTTP response body is created. Rather than relying on a view technology to perform server-side rendering
     * of the greeting data to HTML, this RESTful web service controller simply populates and returns a Greeting object.
     * The object data will be written directly to the HTTP response as JSON.
     */

    @RequestMapping(method = RequestMethod.GET, path = "/greeting")
    @ApiOperation(value = "Respond Greeting", notes = "这里写详细的注释。。。")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "成功"),
            @ApiResponse(code = 404, message = "服务不可用"),
            @ApiResponse(code = 500, message = "未预料到的运行时错误") })
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "world!") String name) {
        //从application.properties中读取my.uuid
        String uuid = environment.getProperty("my.uuid");
        String content = String.format("Hello, %s!", name);
        logger.info("uuid:{}, content:{}", uuid, content);
        return new Greeting(uuid, content, version);
    }

    @RequestMapping(value="/{user_id}/customers", method=RequestMethod.GET)
    public String getUserCustomers(@PathVariable(value = "user_id") Long userId, @RequestParam(value = "order_id") Long orderId) {
        return String.format("userId is %d; orderId is: %d", userId, orderId);
    }
}
