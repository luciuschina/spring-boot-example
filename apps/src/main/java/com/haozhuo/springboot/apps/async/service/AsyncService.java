package com.haozhuo.springboot.apps.async.service;

import com.haozhuo.springboot.apps.async.model.EmployeeAddresses;
import com.haozhuo.springboot.apps.async.model.EmployeeNames;
import com.haozhuo.springboot.apps.async.model.EmployeePhone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CompletableFuture;

/**
 * Created by Lucius on 11/30/18.
 */
@Service
public class AsyncService {

    private static Logger log = LoggerFactory.getLogger(AsyncService.class);
    private final String port;
    private String hostPort;

    @Autowired
    private RestTemplate restTemplate;

    public AsyncService(Environment env) {
        this.port = env.getProperty("server.port");
        this.hostPort = "http://192.168.109.3:" + port;
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Async("asyncExecutor")
    public CompletableFuture<EmployeeNames> getEmployeeName() throws InterruptedException {
        log.info("getEmployeeName starts");

        EmployeeNames employeeNameData = restTemplate.getForObject(hostPort + "/names", EmployeeNames.class);

        log.info("employeeNameData, {}", employeeNameData);
        Thread.sleep(1000L);    //Intentional delay
        log.info("employeeNameData completed");
        return CompletableFuture.completedFuture(employeeNameData);
    }

    @Async("asyncExecutor")
    public CompletableFuture<EmployeeAddresses> getEmployeeAddress() throws InterruptedException {
        log.info("getEmployeeAddress starts");

        EmployeeAddresses employeeAddressData = restTemplate.getForObject(hostPort + "/addresses", EmployeeAddresses.class);
        log.info("employeeAddressData, {}", employeeAddressData);
        Thread.sleep(1000L);    //Intentional delay
        log.info("employeeAddressData completed");
        return CompletableFuture.completedFuture(employeeAddressData);
    }

    @Async("asyncExecutor")
    public CompletableFuture<EmployeePhone> getEmployeePhone() throws InterruptedException {
        log.info("getEmployeePhone starts");

        EmployeePhone employeePhoneData = restTemplate.getForObject(hostPort + "/phones", EmployeePhone.class);

        log.info("employeePhoneData, {}", employeePhoneData);
        Thread.sleep(1000L);    //Intentional delay
        log.info("employeePhoneData completed");
        return CompletableFuture.completedFuture(employeePhoneData);
    }
}