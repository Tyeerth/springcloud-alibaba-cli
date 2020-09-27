package com.jxust.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author tyeerth
 * @date 2020/9/27 - 12:32
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class ConsumerMain9091
{
    public static void main(String[] args)
    {
        SpringApplication.run(ConsumerMain9091.class,args);
    }
}
