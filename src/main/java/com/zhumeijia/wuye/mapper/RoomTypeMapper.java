package com.zhumeijia.wuye.mapper;

import com.zhumeijia.wuye.entity.RoomType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface RoomTypeMapper {
    List<RoomType> findRoom();
}
