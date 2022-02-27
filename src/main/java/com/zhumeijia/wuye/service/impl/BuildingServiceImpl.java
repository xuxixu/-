package com.zhumeijia.wuye.service.impl;

import com.zhumeijia.wuye.entity.Building;
import com.zhumeijia.wuye.mapper.BuildingMapper;
import com.zhumeijia.wuye.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class BuildingServiceImpl implements BuildingService {
    @Autowired
    private BuildingMapper buildingMapper;
    @Override
    public List<Building> queryBuildingName() {
        return buildingMapper.queryBuildingName();
    }
}
