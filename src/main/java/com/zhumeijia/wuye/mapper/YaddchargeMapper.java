package com.zhumeijia.wuye.mapper;

import com.zhumeijia.wuye.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface YaddchargeMapper {
    public void addcharge(Ycharge ycharge);
    public  void  updatecharge(Arrearage arrearage);
    public int selroomid(String roomno);
}
