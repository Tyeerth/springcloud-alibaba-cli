package com.jxust.haoke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author tyeerth
 * @date 2020/9/27 - 11:50
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ProviderMain9090 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderMain9090.class,args);
    }
}