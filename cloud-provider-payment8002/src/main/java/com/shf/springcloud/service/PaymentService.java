package com.shf.springcloud.service;

import com.shf.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author:Su HangFei
 * @Date:2023-02-14 20 42
 * @Project:Cloud
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
