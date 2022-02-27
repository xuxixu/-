package com.zhumeijia.wuye.entity;


public class Goods {

  private long goodsid;
  private String goodsname;
  private long number;
  private long gtid;
  private long whid;
  private java.sql.Timestamp createtime;
  private String uid;
  private double prices;


  public long getGoodsid() {
    return goodsid;
  }

  public void setGoodsid(long goodsid) {
    this.goodsid = goodsid;
  }


  public String getGoodsname() {
    return goodsname;
  }

  public void setGoodsname(String goodsname) {
    this.goodsname = goodsname;
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


  public double getPrices() {
    return prices;
  }

  public void setPrices(double prices) {
    this.prices = prices;
  }

}
