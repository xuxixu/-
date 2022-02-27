package com.zhumeijia.wuye.entity;


public class Procurement {

  private long id;
  private long number;
  private long gtid;
  private long whid;
  private java.sql.Timestamp createtime;
  private String uid;
  private long apid;
  private double totalmoney;
  private String remark;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }


  public long getGtid() {
    return gtid;
  }

  public void setGtid(long gtid) {
    this.gtid = gtid;
  }


  public long getWhid() {
    return whid;
  }

  public void setWhid(long whid) {
    this.whid = whid;
  }


  public java.sql.Timestamp getCreatetime() {
    return createtime;
  }

  public void setCreatetime(java.sql.Timestamp createtime) {
    this.createtime = createtime;
  }


  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  public long getApid() {
    return apid;
  }

  public void setApid(long apid) {
    this.apid = apid;
  }


  public double getTotalmoney() {
    return totalmoney;
  }

  public void setTotalmoney(double totalmoney) {
    this.totalmoney = totalmoney;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
