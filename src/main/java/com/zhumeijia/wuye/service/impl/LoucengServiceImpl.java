package com.zhumeijia.wuye.service.impl;

import com.zhumeijia.wuye.entity.Louceng;
import com.zhumeijia.wuye.mapper.LoucengMapper;
import com.zhumeijia.wuye.service.LoucengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class LoucengServiceImpl implements LoucengService {
    @Autowired
    private LoucengMapper loucengMapper;

    @Override
    public List<Louceng> queryLoucengNo(Integer buildingID) {
        return loucengMapper.queryLoucengNo(buildingID);
    }
}
