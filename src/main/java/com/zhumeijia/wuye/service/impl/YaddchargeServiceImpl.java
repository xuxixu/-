package com.zhumeijia.wuye.service.impl;

import com.zhumeijia.wuye.entity.Arrearage;
import com.zhumeijia.wuye.entity.Ycharge;
import com.zhumeijia.wuye.mapper.YaddchargeMapper;
import com.zhumeijia.wuye.service.YaddchargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class YaddchargeServiceImpl implements YaddchargeService {
    @Autowired
    private YaddchargeMapper yaddchargeMapper;

    @Override
    public void addcharge(Ycharge ycharge) {
        yaddchargeMapper.addcharge(ycharge);
    }

    @Override
    public void updatecharge(Arrearage arrearage) {
        yaddchargeMapper.updatecharge(arrearage);
    }

    @Override
    public int selroomid(String roomno) {
        return yaddchargeMapper.selroomid(roomno);
    }
}
