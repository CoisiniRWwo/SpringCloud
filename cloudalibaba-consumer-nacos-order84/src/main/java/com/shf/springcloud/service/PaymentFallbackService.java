package com.shf.springcloud.service;

import com.shf.springcloud.entities.CommonResult;
import com.shf.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @Author:Su HangFei
 * @Date:2023-03-26 17 08
 * @Project:Cloud
 */
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
