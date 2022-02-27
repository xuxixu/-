package com.zhumeijia.wuye.mapper;

import com.zhumeijia.wuye.entity.Building;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface BuildingMapper {
    List<Building> queryBuildingName();
}
