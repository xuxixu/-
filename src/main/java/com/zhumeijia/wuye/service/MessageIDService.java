package com.zhumeijia.wuye.service;

import com.zhumeijia.wuye.entity.RoomType;

import java.util.List;

public interface MessageIDService {
    List<RoomType> selMessageID(Integer MessageID);
    List<RoomType> selclientName(Integer clientmessageId);
    List<RoomType>selectMax(Integer practicalID);
}
