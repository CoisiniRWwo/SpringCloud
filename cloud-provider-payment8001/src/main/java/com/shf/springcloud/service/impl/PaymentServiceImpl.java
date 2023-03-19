package com.shf.springcloud.service.impl;

import com.shf.springcloud.dao.PaymentDao;
import com.shf.springcloud.entities.Payment;
import com.shf.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:Su HangFei
 * @Date:2023-02-14 20 44
 * @Project:Cloud
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
