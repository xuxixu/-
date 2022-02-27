package com.zhumeijia.wuye.entity;

import java.util.Date;

public class warehouse {
    private int warehouseid;
    private String warehousename;
    private Date createtime;
    private String local;
    private String uid;

    public int getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(int warehouseid) {
        this.warehouseid = warehouseid;
    }

    public String getWarehousename() {
        return warehousename;
    }

    public void setWarehousename(String warehousename) {
        this.warehousename = warehousename;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "warehouse{" +
                "warehouseid=" + warehouseid +
                ", warehousename='" + warehousename + '\'' +
                ", createtime=" + createtime +
                ", local='" + local + '\'' +
                ", uid='" + uid + '\'' +
                '}';
    }
}
