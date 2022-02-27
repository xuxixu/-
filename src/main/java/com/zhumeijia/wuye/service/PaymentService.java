package com.zhumeijia.wuye.service;

import com.zhumeijia.wuye.entity.Payment;
import com.zhumeijia.wuye.entity.pageCount;

import java.util.List;
import java.util.Map;

public interface PaymentService {
    //查询
    public List<Map> sell(pageCount pageCount, Payment payment);
    //查询总数据
    int sellCount(Payment payment);
    //查询一条数据
    public Payment selOne(Integer roomid);
    //进行修改
    public int updates(Payment payment);
}
