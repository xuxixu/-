package com.zhumeijia.wuye.service.impl;

import com.zhumeijia.wuye.entity.Payitems;
import com.zhumeijia.wuye.mapper.PayitemsTypesMapper;
import com.zhumeijia.wuye.service.PayitemsTypesService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class PayitemsTypesServiceImpl implements PayitemsTypesService {
    @Resource
    private PayitemsTypesMapper payitemsTypesMapper;

    @Override
    public List<Payitems> findAll() {
        return payitemsTypesMapper.findAll();
    }
}
