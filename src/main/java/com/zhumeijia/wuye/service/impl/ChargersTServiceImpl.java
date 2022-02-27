package com.zhumeijia.wuye.service.impl;

import com.zhumeijia.wuye.entity.PayItemsT;
import com.zhumeijia.wuye.mapper.ChargesTMapper;
import com.zhumeijia.wuye.service.ChargersTService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class  ChargersTServiceImpl implements ChargersTService {
    @Resource
    private ChargesTMapper chargesTMapper;

    @Override
    public List<PayItemsT> findAll() {
        return chargesTMapper.findAll();
    }
}
