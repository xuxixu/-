package com.zhumeijia.wuye.entity;

import java.util.Date;

public class supplier {
    private int supplierid;
    private String suppliername;
    private String suppliertel;
    private String supplybusiness;
    private Date createtime;
    private String uid;

    @Override
    public String toString() {
        return "supplier{" +
                "supplierid=" + supplierid +
                ", suppliername='" + suppliername + '\'' +
                ", suppliertel='" + suppliertel + '\'' +
                ", supplybusiness='" + supplybusiness + '\'' +
                ", createtime=" + createtime +
                ", uid='" + uid + '\'' +
                '}';
    }

    public int getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(int supplierid) {
        this.supplierid = supplierid;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public String getSuppliertel() {
        return suppliertel;
    }

    public void setSuppliertel(String suppliertel) {
        this.suppliertel = suppliertel;
    }

    public String getSupplybusiness() {
        return supplybusiness;
    }

    public void setSupplybusiness(String supplybusiness) {
        this.supplybusiness = supplybusiness;
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
}
