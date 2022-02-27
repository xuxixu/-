package com.zhumeijia.wuye.service.impl;
import com.zhumeijia.wuye.entity.MeterCharge;
import com.zhumeijia.wuye.mapper.BillMappper;
import com.zhumeijia.wuye.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class BillServiceImpl implements BillService {
    @Autowired
    private BillMappper billMappper;


    @Override
    public void add_bill(Integer roomID, String meterReadTime, String patitemsName, Integer utility, Integer payitemsmoney, String remark) {
        billMappper.add_bill(roomID,meterReadTime,patitemsName,utility,payitemsmoney,remark);
    }

    @Override
    public MeterCharge find_bill(Integer roomID, String patitemsName) {
        return billMappper.find_bill(roomID,patitemsName);
    }


    @Override
    public void up_bill(MeterCharge meterCharge) {
        billMappper.up_bill(meterCharge);
    }


}
