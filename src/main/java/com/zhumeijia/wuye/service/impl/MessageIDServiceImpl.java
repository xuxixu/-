package com.zhumeijia.wuye.service.impl;

import com.zhumeijia.wuye.entity.RoomType;
import com.zhumeijia.wuye.mapper.MessageIDMapper;
import com.zhumeijia.wuye.service.MessageIDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MessageIDServiceImpl implements MessageIDService {
    @Autowired
    private MessageIDMapper messageIDMapper;

    @Override
    public List<RoomType> selMessageID(Integer MessageID) {
        return messageIDMapper.selMessageID(MessageID);
    }

    @Override
    public List<RoomType> selclientName(Integer clientmessageId) {
        return messageIDMapper.selclientName(clientmessageId);
    }

    @Override
    public List<RoomType> selectMax(Integer practicalID) {
        return messageIDMapper.selectMax(practicalID);
    }
}
