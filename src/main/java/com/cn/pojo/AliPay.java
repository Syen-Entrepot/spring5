package com.cn.pojo;

/**
 * @author Syen
 * @date 2019/7/23 0023-上午 3:51
 */
     public class AliPay implements Pay {

    @Override
    public void pay() {
        System.out.println("支付宝支付...");
    }
}
