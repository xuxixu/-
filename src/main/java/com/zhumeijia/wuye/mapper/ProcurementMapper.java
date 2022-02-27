package com.zhumeijia.wuye.mapper;

import com.zhumeijia.wuye.entity.Procurement;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
* @author xuxin
* @description 针对表【procurement】的数据库操作Mapper
* @createDate 2022-02-27 21:10:10
* @Entity com.zhumeijia.wuye.entity.Procurement
*/
@Mapper
public interface ProcurementMapper  {
    public void addProcurement(Procurement procurement);
    public List<Map> findAll(Map<String,Object> map);
    public void updateProcurement(Procurement procurement);
}




