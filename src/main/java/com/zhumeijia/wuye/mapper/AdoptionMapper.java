package com.zhumeijia.wuye.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhumeijia.wuye.entity.Adoption;
import java.util.List;
import java.util.Map;

/**
* @author xuxin
* @description 针对表【adoption】的数据库操作Mapper
* @createDate 2022-02-27 20:42:23
* @Entity generator.domain.Adoption
*/
public interface AdoptionMapper{
    public void addAdoption(Adoption adoption);
    public List<Map> findAll(Map<String,Object> map);
    public void updateAdoption(Adoption adoption);
}




