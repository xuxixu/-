package com.zhumeijia.wuye.controller;

import com.zhumeijia.wuye.entity.*;
import com.zhumeijia.wuye.service.GmdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
//@Controller：表示一个特定的类作为控制器
public class GmdController {
    @Autowired  //自动注入  自动引用bean里面的对象

    private GmdService gmdService;
    @RequestMapping("groom")  //用来表示http请求地址
    public String  meter(){
        return "groom";
    }
//   查询数据
    @RequestMapping("glistData")
    @ResponseBody //不需要跳转路径  直接返回json数据  用于异步请求
    public tableResult<Map> listData(pageCount pageCount, com.zhumeijia.wuye.entity.GmdRoom gmdRoom){

        tableResult<Map> result=new tableResult<>();
        List<Map> list=gmdService.selectAll(pageCount,gmdRoom);
        //设置表格有多少条数据
        int count=gmdService.selectCount(gmdRoom);
        result.setData(list);
        result.setCount(count);
        return result;
    }
    //  //根据房间id删除房间信息
    @RequestMapping("/delRoom")
    @ResponseBody
    public tableResult<com.zhumeijia.wuye.entity.GmdRoom> delRoom(Integer roomid){
        gmdService.delRoom(roomid);
        tableResult result=new tableResult();
        result.setMsg("删除成功");
        return result;
    }
    //跳转添加页面
    @RequestMapping("/addroom")
    public String add(com.zhumeijia.wuye.entity.GmdRoom gmdRoom, Model model){
        List<com.zhumeijia.wuye.entity.GmdRoom> sb=gmdService.selB(gmdRoom);
        model.addAttribute("sb",sb);
        return "addgroom";
    }
    //根据单元号id查询楼层
    @RequestMapping("selBs")
    @ResponseBody
    public com.zhumeijia.wuye.entity.ResultOne<com.zhumeijia.wuye.entity.GmdRoom> selBs(Integer buildingid, com.zhumeijia.wuye.entity.GmdRoom gmdRoom){
        List<com.zhumeijia.wuye.entity.GmdRoom> gg=gmdService.selBs(buildingid);
        com.zhumeijia.wuye.entity.ResultOne result=new com.zhumeijia.wuye.entity.ResultOne();
         int loucengcount=gg.get(0).getLoucengcount();
        result.setData(loucengcount);
        return result;

    }

    //执行添加
    @RequestMapping("addRoom")
    @ResponseBody
    public com.zhumeijia.wuye.entity.ResultOne<com.zhumeijia.wuye.entity.GmdRoom> addRoom(com.zhumeijia.wuye.entity.GmdRoom gmdRoom){
        int a=gmdService.selAddr(gmdRoom);
        com.zhumeijia.wuye.entity.ResultOne result=new com.zhumeijia.wuye.entity.ResultOne();
        if(a>0){
            result.setMsg("已存在");
            result.setData(false);

        }else{
            gmdService.addLoucy(gmdRoom);
            gmdService.addRoom(gmdRoom);
            result.setMsg("添加成功");
            result.setData(true);

        }
        return  result;
    }
    //修改时查询
    @RequestMapping("upSel")

    public String upSelRoom(com.zhumeijia.wuye.entity.GmdRoom gmdRoom, Model model){
        //查询楼宇信息
        List<com.zhumeijia.wuye.entity.GmdRoom> gs=gmdService.selB(gmdRoom);
//        //查询楼层信息
//       List<GmdRoom> gu= gmdService.upSelly(gmdRoom);
        //查询房间信息
        List<com.zhumeijia.wuye.entity.GmdRoom> gr=gmdService.upSelRoom(gmdRoom);
        model.addAttribute("gs",gs);
//        model.addAttribute("gu",gu);
        model.addAttribute("gr",gr);
        return "upgroom";

    }
    //执行修改
    @RequestMapping("upRoom")
    @ResponseBody
    public com.zhumeijia.wuye.entity.ResultOne<com.zhumeijia.wuye.entity.GmdRoom> upRoom(com.zhumeijia.wuye.entity.GmdRoom gmdRoom){
        int a=gmdService.selAddr(gmdRoom);
        com.zhumeijia.wuye.entity.ResultOne result=new com.zhumeijia.wuye.entity.ResultOne();
        if(a>0){
            result.setMsg("已存在");
            result.setData(false);

        }else{
//           gmdService.upRlc(gmdRoom);
           gmdService.upRoom(gmdRoom);
            result.setMsg("修改成功");
            result.setData(true);

        }
        return  result;
    }
    //添加时查询单元号楼层号和客户信息
    @RequestMapping("addSel")
    public String addSel(com.zhumeijia.wuye.entity.GmdRoom gmdRoom, Model Model){
        //添加时查询的单元号和楼层号
       List<com.zhumeijia.wuye.entity.GmdRoom>ga= gmdService.addSellr(gmdRoom);
        //添加时查询客户姓名
        List<com.zhumeijia.wuye.entity.GmdRoom> gc=gmdService.addSelc(gmdRoom);
        Model.addAttribute("ga",ga);
        Model.addAttribute("gc",gc);
        return "addgbtnroom";

    }

    //执行添加并修改房间状态
    @RequestMapping("addBtnRoom")
    @ResponseBody
    public com.zhumeijia.wuye.entity.ResultOne<com.zhumeijia.wuye.entity.GmdRoom> addBtnRoom(com.zhumeijia.wuye.entity.GmdRoom gmdRoom){
        gmdService.addBtnroom(gmdRoom);
        com.zhumeijia.wuye.entity.ResultOne result=new com.zhumeijia.wuye.entity.ResultOne();
        result.setMsg("添加户主成功");
        return  result;

    }

}
