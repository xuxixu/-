package com.zhumeijia.wuye.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName procurement
 */
public class Procurement implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer number;

    /**
     * 
     */
    private Integer gtid;

    /**
     * 
     */
    private Integer whid;

    /**
     * 
     */
    private Date createtime;

    /**
     * 
     */
    private String uid;

    /**
     * 
     */
    private Integer apid;

    /**
     * 
     */
    private Double totalmoney;

    /**
     * 
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 
     */
    public Integer getGtid() {
        return gtid;
    }

    /**
     * 
     */
    public void setGtid(Integer gtid) {
        this.gtid = gtid;
    }

    /**
     * 
     */
    public Integer getWhid() {
        return whid;
    }

    /**
     * 
     */
    public void setWhid(Integer whid) {
        this.whid = whid;
    }

    /**
     * 
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 
     */
    public String getUid() {
        return uid;
    }

    /**
     * 
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * 
     */
    public Integer getApid() {
        return apid;
    }

    /**
     * 
     */
    public void setApid(Integer apid) {
        this.apid = apid;
    }

    /**
     * 
     */
    public Double getTotalmoney() {
        return totalmoney;
    }

    /**
     * 
     */
    public void setTotalmoney(Double totalmoney) {
        this.totalmoney = totalmoney;
    }

    /**
     * 
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Procurement other = (Procurement) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getGtid() == null ? other.getGtid() == null : this.getGtid().equals(other.getGtid()))
            && (this.getWhid() == null ? other.getWhid() == null : this.getWhid().equals(other.getWhid()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getApid() == null ? other.getApid() == null : this.getApid().equals(other.getApid()))
            && (this.getTotalmoney() == null ? other.getTotalmoney() == null : this.getTotalmoney().equals(other.getTotalmoney()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getGtid() == null) ? 0 : getGtid().hashCode());
        result = prime * result + ((getWhid() == null) ? 0 : getWhid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getApid() == null) ? 0 : getApid().hashCode());
        result = prime * result + ((getTotalmoney() == null) ? 0 : getTotalmoney().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", number=").append(number);
        sb.append(", gtid=").append(gtid);
        sb.append(", whid=").append(whid);
        sb.append(", createtime=").append(createtime);
        sb.append(", uid=").append(uid);
        sb.append(", apid=").append(apid);
        sb.append(", totalmoney=").append(totalmoney);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}