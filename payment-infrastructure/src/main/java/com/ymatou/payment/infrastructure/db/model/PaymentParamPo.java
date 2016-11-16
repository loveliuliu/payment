package com.ymatou.payment.infrastructure.db.model;

public class PaymentParamPo {
    /**
     * INTEGER(10) 必填<br>
     * 
     */
    private Integer paramId;

    /**
     * VARCHAR(50) 必填<br>
     * 
     */
    private String paramCat;

    /**
     * VARCHAR(50) 必填<br>
     * 
     */
    private String paramKey;

    /**
     * VARCHAR(200)<br>
     * 
     */
    private String paramStrValue;

    /**
     * INTEGER(10)<br>
     * 
     */
    private Integer paramIntValue;

    /**
     * VARCHAR(100)<br>
     * 
     */
    private String memo;

    /**
     * INTEGER(10) 必填<br>
     */
    public Integer getParamId() {
        return paramId;
    }

    /**
     * INTEGER(10) 必填<br>
     */
    public void setParamId(Integer paramId) {
        this.paramId = paramId;
    }

    /**
     * VARCHAR(50) 必填<br>
     */
    public String getParamCat() {
        return paramCat;
    }

    /**
     * VARCHAR(50) 必填<br>
     */
    public void setParamCat(String paramCat) {
        this.paramCat = paramCat == null ? null : paramCat.trim();
    }

    /**
     * VARCHAR(50) 必填<br>
     */
    public String getParamKey() {
        return paramKey;
    }

    /**
     * VARCHAR(50) 必填<br>
     */
    public void setParamKey(String paramKey) {
        this.paramKey = paramKey == null ? null : paramKey.trim();
    }

    /**
     * VARCHAR(200)<br>
     */
    public String getParamStrValue() {
        return paramStrValue;
    }

    /**
     * VARCHAR(200)<br>
     */
    public void setParamStrValue(String paramStrValue) {
        this.paramStrValue = paramStrValue == null ? null : paramStrValue.trim();
    }

    /**
     * INTEGER(10)<br>
     */
    public Integer getParamIntValue() {
        return paramIntValue;
    }

    /**
     * INTEGER(10)<br>
     */
    public void setParamIntValue(Integer paramIntValue) {
        this.paramIntValue = paramIntValue;
    }

    /**
     * VARCHAR(100)<br>
     */
    public String getMemo() {
        return memo;
    }

    /**
     * VARCHAR(100)<br>
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_PaymentParam
     *
     * @mbggenerated Tue Nov 15 20:02:34 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", paramId=").append(paramId);
        sb.append(", paramCat=").append(paramCat);
        sb.append(", paramKey=").append(paramKey);
        sb.append(", paramStrValue=").append(paramStrValue);
        sb.append(", paramIntValue=").append(paramIntValue);
        sb.append(", memo=").append(memo);
        sb.append("]");
        return sb.toString();
    }
}