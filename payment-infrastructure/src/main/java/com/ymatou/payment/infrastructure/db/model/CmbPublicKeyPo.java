package com.ymatou.payment.infrastructure.db.model;

import java.util.Date;

public class CmbPublicKeyPo {
    /**
     * INTEGER(10) 必填<br>
     * 
     */
    private Integer id;

    /**
     * VARCHAR(2000) 必填<br>
     * 
     */
    private String publicKey;

    /**
     * TIMESTAMP(23,3) 默认值[(getdate())] 必填<br>
     * 
     */
    private Date createdTime;

    /**
     * INTEGER(10) 必填<br>
     */
    public Integer getId() {
        return id;
    }

    /**
     * INTEGER(10) 必填<br>
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * VARCHAR(2000) 必填<br>
     */
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * VARCHAR(2000) 必填<br>
     */
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey == null ? null : publicKey.trim();
    }

    /**
     * TIMESTAMP(23,3) 默认值[(getdate())] 必填<br>
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * TIMESTAMP(23,3) 默认值[(getdate())] 必填<br>
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_CmbPublicKey
     *
     * @mbggenerated Tue Nov 15 20:02:34 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", publicKey=").append(publicKey);
        sb.append(", createdTime=").append(createdTime);
        sb.append("]");
        return sb.toString();
    }
}