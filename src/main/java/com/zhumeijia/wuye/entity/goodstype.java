package com.zhumeijia.wuye.entity;

import java.util.Date;


public class goodstype {
    private int goodstypeid;
    private String name;
    private Date createtime;
    private String uid;
    private String remark;

    public int getGoodstypeid() {
        return goodstypeid;
    }

    public void setGoodstypeid(int goodstypeid) {
        this.goodstypeid = goodstypeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "goodstype{" +
                "goodstypeid=" + goodstypeid +
                ", name='" + name + '\'' +
                ", createtime=" + createtime +
                ", uid='" + uid + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
