package com.zhumeijia.wuye.service;
import com.zhumeijia.wuye.entity.MeterCharge;
import com.zhumeijia.wuye.entity.pageCount;

import java.util.List;
import java.util.Map;

public interface MeterChargeService {
    List<Map> selAll(pageCount pageCount, MeterCharge meterCharge);
    int selCount(MeterCharge meterCharge);
    void update_do(Integer meterID);
    void updateAll_do(Integer[] meterID);
    void updateReAudit_do(Integer meterID);
    void update_true(Integer meterID);
    void update_false(Integer meterID);
}
