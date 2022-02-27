package com.zhumeijia.wuye.service.impl;

import com.zhumeijia.wuye.entity.Collectreport;
import com.zhumeijia.wuye.entity.pageCount;
import com.zhumeijia.wuye.mapper.CollectMapper;
import com.zhumeijia.wuye.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class CollectServiceImpl implements CollectService {
@Autowired
private CollectMapper collectMapper;
    @Override
    public List<Map> selcol(pageCount pageCount, Collectreport collectreport) {
        int begin=pageCount.getLimit()*(pageCount.getPage()-1);
        int end=pageCount.getLimit()*pageCount.getPage()-begin;
        Map<String,Object> map=new HashMap<>();
        map.put("begin",begin);
        map.put("end",end);
        map.put("clientname",collectreport.getClientname());
        map.put("Cbegin",collectreport.getCbegin());
        map.put("Cend",collectreport.getCend());
        map.put("testh",collectreport.getTesth());
        return collectMapper.selcol(map);
    }

    @Override
    public int selcolCount(Collectreport collectreport) {
        return collectMapper.selcolCount(collectreport);
    }
}
