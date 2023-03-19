package com.shf.springcloud.controller;

import com.shf.springcloud.entities.CommonResult;
import com.shf.springcloud.entities.Payment;
import com.shf.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:Su HangFei
 * @Date:2023-03-15 20 14
 * @Project:Cloud
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }
}
