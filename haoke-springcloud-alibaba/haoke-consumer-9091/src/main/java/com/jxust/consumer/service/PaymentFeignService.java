package com.jxust.consumer.service;

import entities.CommonResult;
import entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author tyeerth
 * @date 2020/6/20 - 11:11
 */
@Component
@FeignClient(value = "nacos-haoke-provider")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
}
