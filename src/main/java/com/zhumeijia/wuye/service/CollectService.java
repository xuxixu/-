package com.zhumeijia.wuye.service;

import com.zhumeijia.wuye.entity.Collectreport;
import com.zhumeijia.wuye.entity.pageCount;

import java.util.List;
import java.util.Map;

public interface CollectService {
    //查询欠费报表
public List<Map> selcol(pageCount pageCount,Collectreport collectreport);
//查询总数据
    public int selcolCount(Collectreport collectreport);
}
