package com.zhumeijia.wuye.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName warehouse
 */
@TableName("warehouse")
public class Warehouse implements Serializable {
    /**
     * 
     */
    @TableId(value = "id",type = IdType.AUTO)//在自增主键的变量加上即可
    private Integer warehouseid;

    /**
     * 
     */
    private String warehousename;

    /**
     * 
     */
    private Date createtime;

    /**
     * 
     */
    private String local;

    /**
     * 
     */
    private String uid;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getWarehouseid() {
        return warehouseid;
    }

    /**
     * 
     */
    public void setWarehouseid(Integer warehouseid) {
        this.warehouseid = warehouseid;
    }

    /**
     * 
     */
    public String getWarehousename() {
        return warehousename;
    }

    /**
     * 
     */
    public void setWarehousename(String warehousename) {
        this.warehousename = warehousename;
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
    public String getLocal() {
        return local;
    }

    /**
     * 
     */
    public void setLocal(String local) {
        this.local = local;
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
        Warehouse other = (Warehouse) that;
        return (this.getWarehouseid() == null ? other.getWarehouseid() == null : this.getWarehouseid().equals(other.getWarehouseid()))
            && (this.getWarehousename() == null ? other.getWarehousename() == null : this.getWarehousename().equals(other.getWarehousename()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getLocal() == null ? other.getLocal() == null : this.getLocal().equals(other.getLocal()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWarehouseid() == null) ? 0 : getWarehouseid().hashCode());
        result = prime * result + ((getWarehousename() == null) ? 0 : getWarehousename().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLocal() == null) ? 0 : getLocal().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", warehouseid=").append(warehouseid);
        sb.append(", warehousename=").append(warehousename);
        sb.append(", createtime=").append(createtime);
        sb.append(", local=").append(local);
        sb.append(", uid=").append(uid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}