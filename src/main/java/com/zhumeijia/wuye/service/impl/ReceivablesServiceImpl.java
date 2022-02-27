package com.zhumeijia.wuye.service.impl;

import com.zhumeijia.wuye.entity.Receivables;
import com.zhumeijia.wuye.entity.pageCount;
import com.zhumeijia.wuye.mapper.ReceivablesMapper;
import com.zhumeijia.wuye.service.ReceivablesService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
@Transactional
public class ReceivablesServiceImpl implements ReceivablesService {
    @Resource
    private ReceivablesMapper receivablesMapper;

    @Override
    public List<Map> selectAll(pageCount pageCount, Receivables receivables) {
        int begin =pageCount.getLimit()*(pageCount.getPage()-1);
        int end=pageCount.getLimit()*pageCount.getPage()-begin;
        Map<String,Object> map=new HashMap<>();
        map.put("begin",begin);
        map.put("end",end);
        map.put("roomNO",receivables.getRoomNO());
        return receivablesMapper.selectAll(map);
    }
}