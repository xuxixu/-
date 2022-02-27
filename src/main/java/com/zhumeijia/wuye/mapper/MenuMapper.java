package com.zhumeijia.wuye.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhumeijia.wuye.entity.Menu;
import com.zhumeijia.wuye.entity.ShowMenuVo;

import java.util.List;
import java.util.Map;
public interface MenuMapper extends BaseMapper<Menu> {

    List<ShowMenuVo> selectShowMenuByUser(Map<String,Object> map);

    List<Menu> getMenus(Map<String,Object> map);
}