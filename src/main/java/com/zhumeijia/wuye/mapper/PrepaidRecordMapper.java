package com.zhumeijia.wuye.mapper;

import com.zhumeijia.wuye.entity.PrepaidRecord;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface PrepaidRecordMapper {
    List<Map> selectAll(Map<String, Object> map);
    int selectCount(PrepaidRecord prepaidRecord);
}
