package com.zhumeijia.wuye.service;

import com.zhumeijia.wuye.entity.PrepaidRecord;
import com.zhumeijia.wuye.entity.pageCount;

import java.util.List;
import java.util.Map;

public interface PrepaidRecordService {
    List<Map> selectAll(pageCount pageCount, PrepaidRecord prepaidRecord);
    int selectCount(PrepaidRecord prepaidRecord);
}
