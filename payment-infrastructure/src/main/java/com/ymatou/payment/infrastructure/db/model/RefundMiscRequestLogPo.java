package com.ymatou.payment.infrastructure.db.model;

import java.util.Date;

public class RefundMiscRequestLogPo {
    /**
     * CHAR(36) 默认值[(newid())] 必填<br>
     * 
     */
    private String logId;

    /**
     * VARCHAR(64) 必填<br>
     * 
     */
    private String correlateId;

    /**
     * VARCHAR(64) 必填<br>
     * 
     */
    private String method;

    /**
     * TIMESTAMP(23,3) 默认值[(getdate())] 必填<br>
     * 
     */
    private Date requestTime;

    /**
     * TIMESTAMP(23,3) 必填<br>
     * 
     */
    private Date responseTime;

    /**
     * BIT(1) 默认值[((0))] 必填<br>
     * 
     */
    private Boolean isException;

    /**
     * VARCHAR(64)<br>
     * 
     */
    private String refundBatchNo;

    /**
     * CHAR(36) 默认值[(newid())] 必填<br>
     */
    public String getLogId() {
        return logId;
    }

    /**
     * CHAR(36) 默认值[(newid())] 必填<br>
     */
    public void setLogId(String logId) {
        this.logId = logId == null ? null : logId.trim();
    }

    /**
     * VARCHAR(64) 必填<br>
     */
    public String getCorrelateId() {
        return correlateId;
    }

    /**
     * VARCHAR(64) 必填<br>
     */
    public void setCorrelateId(String correlateId) {
        this.correlateId = correlateId == null ? null : correlateId.trim();
    }

    /**
     * VARCHAR(64) 必填<br>
     */
    public String getMethod() {
        return method;
    }

    /**
     * VARCHAR(64) 必填<br>
     */
    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    /**
     * TIMESTAMP(23,3) 默认值[(getdate())] 必填<br>
     */
    public Date getRequestTime() {
        return requestTime;
    }

    /**
     * TIMESTAMP(23,3) 默认值[(getdate())] 必填<br>
     */
    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    /**
     * TIMESTAMP(23,3) 必填<br>
     */
    public Date getResponseTime() {
        return responseTime;
    }

    /**
     * TIMESTAMP(23,3) 必填<br>
     */
    public void setResponseTime(Date responseTime) {
        this.responseTime = responseTime;
    }

    /**
     * BIT(1) 默认值[((0))] 必填<br>
     */
    public Boolean getIsException() {
        return isException;
    }

    /**
     * BIT(1) 默认值[((0))] 必填<br>
     */
    public void setIsException(Boolean isException) {
        this.isException = isException;
    }

    /**
     * VARCHAR(64)<br>
     */
    public String getRefundBatchNo() {
        return refundBatchNo;
    }

    /**
     * VARCHAR(64)<br>
     */
    public void setRefundBatchNo(String refundBatchNo) {
        this.refundBatchNo = refundBatchNo == null ? null : refundBatchNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RefundMiscRequestLog
     *
     * @mbggenerated Tue Nov 15 20:02:34 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logId=").append(logId);
        sb.append(", correlateId=").append(correlateId);
        sb.append(", method=").append(method);
        sb.append(", requestTime=").append(requestTime);
        sb.append(", responseTime=").append(responseTime);
        sb.append(", isException=").append(isException);
        sb.append(", refundBatchNo=").append(refundBatchNo);
        sb.append("]");
        return sb.toString();
    }
}