package com.shf.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.shf.springcloud.entities.CommonResult;

/**
 * @Author:Su HangFei
 * @Date:2023-03-26 16 27
 * @Project:Cloud
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
