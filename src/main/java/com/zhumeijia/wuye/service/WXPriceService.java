package com.zhumeijia.wuye.service;

import com.zhumeijia.wuye.entity.WXPrice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WXPriceService {
    List<WXPrice> searchList(String roomNo);
    int updateFee(@Param("roomID") Integer roomID, @Param("payproject") String payproject);
    int addPayType(@Param("clientname") String clientname,@Param("assessment") double assessment);
}
