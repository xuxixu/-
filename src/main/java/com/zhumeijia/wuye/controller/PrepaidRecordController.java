package com.zhumeijia.wuye.controller;

import com.zhumeijia.wuye.entity.PrepaidRecord;
import com.zhumeijia.wuye.entity.pageCount;
import com.zhumeijia.wuye.entity.tableResult;
import com.zhumeijia.wuye.service.PrepaidRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class PrepaidRecordController {
    @Autowired
    private PrepaidRecordService prepaidRecordService;
    @RequestMapping("prepaidRecord")
    public String meter(){
        return "prepaidRecord";
    }
//    查询数据
   @RequestMapping("listData3")
   @ResponseBody
    public tableResult<Map> listData(pageCount pageCount, PrepaidRecord prepaidRecord){

       tableResult<Map> result=new tableResult<>();
       List<Map> list=prepaidRecordService.selectAll(pageCount,prepaidRecord);
       //设置表格有多少条数据
       int count=prepaidRecordService.selectCount(prepaidRecord);
       result.setData(list);
       result.setCount(count);
       return result;
    }
}
