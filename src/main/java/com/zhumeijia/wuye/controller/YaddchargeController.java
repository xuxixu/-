package com.zhumeijia.wuye.controller;

import com.zhumeijia.wuye.entity.*;
import com.zhumeijia.wuye.service.YaddchargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;


@Controller
public class YaddchargeController {
    @Autowired
    private YaddchargeService yaddchargeService;
    @RequestMapping("ycharge")
    @ResponseBody
    public  ResultOne<Map> Ycharge(Ycharge ycharge,Arrearage arrearage){
        yaddchargeService.updatecharge(arrearage);
        yaddchargeService.addcharge(ycharge);
        System.out.println(ycharge.getRoomno());
        System.out.println("123456789");
        ResultOne result=new ResultOne();
        result.setMsg("收费成功！");
        result.setData(true);
        return result;
    }
}
