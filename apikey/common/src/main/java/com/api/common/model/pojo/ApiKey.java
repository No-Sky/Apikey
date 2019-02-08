package com.api.common.model.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @description:
 * @author: XFW
 * @version:
 * @create: 2019-01-31 15:47
 **/
public class ApiKey {
    /** **/
    private String id;
    /** **/
    private String name;
    /** **/
    private String password;
    /** **/
    private String type;
    /** **/
    private String key;
    /** **/
    private Date createTime;
    /** **/
    private Date updateTime;
    /**
    *    apikey状态：1可用，2即将失效，0失效
    **/
    private Integer status = 1;
    /** **/
    private Integer deleted;

    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id=id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password=password;
    }
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type=type;
    }
    public String getKey() {
        return this.key;
    }
    public void setKey(String key) {
        this.key=key;
    }
    public Date getCreateTime() {
        return this.createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime=createTime;
    }
    public Date getUpdateTime() {
        return this.updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime=updateTime;
    }
    public Integer getStatus() {
        return this.status;
    }
    public void setStatus(Integer status) {
        this.status=status;
    }
    public Integer getDeleted() {
        return this.deleted;
    }
    public void setDeleted(Integer deleted) {
        this.deleted=deleted;
    }

    @Override
    public String toString() {
        return "ApiKey{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                ", key='" + key + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", status=" + status +
                ", deleted=" + deleted +
                '}';
    }
}
