package com.zhumeijia.wuye.service.impl;

import com.zhumeijia.wuye.entity.WXPrice;
import com.zhumeijia.wuye.mapper.WXPriceMapper;
import com.zhumeijia.wuye.service.WXPriceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class WXPriceServiceImpl implements WXPriceService {
    @Resource
    private WXPriceMapper wxPriceMapper;
    @Override
    public List<WXPrice> searchList(String roomNo) {
        return wxPriceMapper.searchList(roomNo);
    }

    @Override
    public int updateFee(Integer roomID, String payProject) {
        return wxPriceMapper.updateFee(roomID,payProject);
    }

    @Override
    public int addPayType(String clientname, double assessment) {
        return wxPriceMapper.addPayType(clientname,assessment);
    }

}
