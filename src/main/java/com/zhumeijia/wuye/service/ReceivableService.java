package com.zhumeijia.wuye.service;

import com.zhumeijia.wuye.entity.Receivable;
import com.zhumeijia.wuye.entity.pageCount;

import java.util.List;
import java.util.Map;

public interface ReceivableService {
    List<Map> selectAll(pageCount pageCount,Receivable receivable);
    int selectCount(Receivable receivable);
}
