package com.zhumeijia.wuye.service;

import com.zhumeijia.wuye.entity.Arrearage;
import com.zhumeijia.wuye.entity.pageCount;

import java.util.List;
import java.util.Map;

public interface ArreaService {
    //查询
    public List<Map> selArea(pageCount pageCount, Arrearage arrearage);
    //查询总数据
    public int selCount(Arrearage arrearage);
}
