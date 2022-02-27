package com.zhumeijia.wuye.service;


import com.zhumeijia.wuye.entity.Receivables;
import com.zhumeijia.wuye.entity.pageCount;

import java.util.List;
import java.util.Map;

public interface ReceivablesService {
    List<Map> selectAll(pageCount pageCount, Receivables receivables);
}
