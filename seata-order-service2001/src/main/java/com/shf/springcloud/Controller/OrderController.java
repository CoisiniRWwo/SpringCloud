package com.shf.springcloud.Controller;

import com.shf.springcloud.domain.CommonResult;
import com.shf.springcloud.domain.Order;
import com.shf.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:Su HangFei
 * @Date:2023-03-27 21 09
 * @Project:Cloud
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
