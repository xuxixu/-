package com.zhumeijia.wuye.controller;


import com.zhumeijia.wuye.entity.GmdCar;
import com.zhumeijia.wuye.entity.pageCount;
import com.zhumeijia.wuye.entity.tableResult;
import com.zhumeijia.wuye.service.GmdCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
//@Controller：表示一个特定的类作为控制器
public class GmdCarController {
    @Autowired
    //自动注入  自动引用bean里面的对象
    //共同点：@Resource和@Autowired都是做bean的注入时使用，其实@Resource并不是Spring的注解，它的包是javax.annotation.Resource，需要导入，但是Spring支持该注解的注入。
    //不同点：@Autowired为Spring提供的注解，需要导入包org.springframework.beans.factory.annotation.Autowired;只按照byType（类型）注入。
    //两种注入方式  1. 用于字段上  2.用于set方法
    private GmdCarService gmdCarService;

    @RequestMapping("/gcar")
    //用来表示http请求地址
    public String gcar(){
        return "gcar";
    }

    @RequestMapping("gcarlistDate")
    @ResponseBody //不需要跳转路径  直接返回json数据  用于异步请求
    public tableResult<GmdCar> listData(pageCount pageCount, GmdCar gmdCar){
        tableResult<GmdCar> result=new tableResult<>();
        List<Map> list=gmdCarService.selectAllcar(pageCount,gmdCar);
        //设置表格有多少条数据
        int count=gmdCarService.selectCountcar(gmdCar);
        result.setData(list);
        result.setCount(count);
        return result;
    }

    //  //根据房间id禁用信息
    @RequestMapping("/delCar")
    @ResponseBody
    public tableResult<GmdCar> delCar(Integer carportid){
        gmdCarService.delRoom(carportid);
        tableResult result=new tableResult();
        result.setMsg("禁用成功");
        return result;
    }
    //  //根据房间id启用房间信息
    @RequestMapping("/delqCar")
    @ResponseBody
    public tableResult<GmdCar> delqCar(Integer carportid){
        gmdCarService.delqCar(carportid);
        tableResult result=new tableResult();
        result.setMsg("启用成功");
        return result;
    }
    //查询车位信息表
    @RequestMapping("selCarportT")
    public String selCarportT(GmdCar gmdCar, Model model){
        List<GmdCar> gc=gmdCarService.selCarportT(gmdCar);
        model.addAttribute("gc",gc);
        return "addgcar";
    }
    //添加车位信息
    @RequestMapping("/addCar")
    @ResponseBody
    public com.zhumeijia.wuye.entity.ResultOne<GmdCar> addCar(GmdCar gmdCar, String carportno){
        int a= gmdCarService.selAddcar(carportno);
        System.out.print(a);
        com.zhumeijia.wuye.entity.ResultOne result=new com.zhumeijia.wuye.entity.ResultOne();


       if(a>0){
           result.setMsg("车位已存在");
           result.setData(false);
           return  result;
       }
        else {
           gmdCarService.addCar(gmdCar);
           result.setMsg("添加成功");
           result.setData(true);
           return result;
       }
    }
    //修改时查询
    @RequestMapping("selcUp")
    public String selcUp(GmdCar gmdCar, Model model, Integer carportid){
        List<GmdCar> ss=gmdCarService.selCarportT(gmdCar);
       List<GmdCar> sc= gmdCarService.selcUp(carportid);
        model.addAttribute("sc",sc);
        model.addAttribute("ss",ss);
        return "gupdatecar";

    }
    //执行修改
    @RequestMapping("UpCar")
    @ResponseBody
    public com.zhumeijia.wuye.entity.ResultOne<GmdCar> UpCar(GmdCar gmdCar, String carportno){
        com.zhumeijia.wuye.entity.ResultOne result=new com.zhumeijia.wuye.entity.ResultOne();
        int a=gmdCarService.selAddcar(carportno);
        if(a>0){
            result.setMsg("已存在无法修改");
            result.setData(false);
            return result;
        }else {
            gmdCarService.UpCar(gmdCar);
            result.setMsg("修改成功");
            result.setData(true);
            return  result;
        }

    }
    //跳转车位绑定页面  查询车位类型表
    //查询车位编号与车位类型
    @RequestMapping("addgbtncar")
    public String addgbtncar(GmdCar gmdCar, Model model, Integer carportid){
        List<GmdCar> gsb=gmdCarService.selBtncar(carportid);
        List<GmdCar> gsc=gmdCarService.selCarportT(gmdCar);
        List<GmdCar> rc=gmdCarService.selRc(gmdCar);
        model.addAttribute("gsb",gsb);
        model.addAttribute("gsc",gsc);
        model.addAttribute("rc",rc);
        return "addgbtncar";
    }
//车位绑定时通过房间查询客户
    @RequestMapping("selC")
    @ResponseBody
    public com.zhumeijia.wuye.entity.ResultOne<GmdCar> selC(GmdCar gmdCar, String roomno, Model model){
        GmdCar gmdCar1=new GmdCar();
        List<GmdCar> gc=gmdCarService.selC(roomno);
        String clientname= gc.get(0).getClientname();
        com.zhumeijia.wuye.entity.ResultOne result=new com.zhumeijia.wuye.entity.ResultOne();
        result.setData(clientname);
        return result;
    }
    //执行车位绑定
    @RequestMapping("upBtn")
    @ResponseBody
    public com.zhumeijia.wuye.entity.ResultOne<GmdCar> upBtn(GmdCar gmdCar, Integer carportid){
        gmdCarService.upWei(gmdCar);
        gmdCarService.upBtncar(gmdCar);
        gmdCarService.upcCarp(gmdCar);
        gmdCarService.upBtn(gmdCar);
        gmdCarService.upCarp(carportid);

        com.zhumeijia.wuye.entity.ResultOne result=new com.zhumeijia.wuye.entity.ResultOne();
        result.setMsg("修改成功");
        return  result;
    }


}
