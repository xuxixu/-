package com.zhumeijia.wuye.service.impl;

import com.zhumeijia.wuye.entity.RoomType;
import com.zhumeijia.wuye.mapper.RoomTypeMapper;
import com.zhumeijia.wuye.service.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class RoomTypeServiceImpl implements RoomTypeService {
    @Autowired
    private RoomTypeMapper roomTypeMapper;
    @Override
    public List<RoomType> findRoom() {
        return roomTypeMapper.findRoom();
    }
}
