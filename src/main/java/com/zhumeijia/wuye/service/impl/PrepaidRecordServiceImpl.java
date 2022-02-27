package com.zhumeijia.wuye.service.impl;

import com.zhumeijia.wuye.entity.PrepaidRecord;
import com.zhumeijia.wuye.entity.pageCount;
import com.zhumeijia.wuye.mapper.PrepaidRecordMapper;
import com.zhumeijia.wuye.service.PrepaidRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class PrepaidRecordServiceImpl implements  PrepaidRecordService {
    @Autowired
    private PrepaidRecordMapper prepaidRecordMapper;

//实现分页与模糊查询
    @Override
    public List<Map> selectAll(pageCount pageCount,PrepaidRecord prepaidRecord) {
        int begin=pageCount.getLimit()*(pageCount.getPage()-1);
        int end=pageCount.getLimit()*pageCount.getPage()-begin;
        Map<String,Object> map=new HashMap<>();
        map.put("begin",begin);
        map.put("end",end);
        map.put("clientname",prepaidRecord.getClientname());
        return prepaidRecordMapper.selectAll(map);
    }
//查找数据总条数1
    @Override
    public int selectCount(PrepaidRecord prepaidRecord) {
        return prepaidRecordMapper.selectCount(prepaidRecord);
    }

}
