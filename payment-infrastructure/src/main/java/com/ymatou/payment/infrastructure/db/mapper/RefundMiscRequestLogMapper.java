package com.ymatou.payment.infrastructure.db.mapper;

import com.ymatou.payment.infrastructure.db.model.RefundMiscRequestLogExample;
import com.ymatou.payment.infrastructure.db.model.RefundMiscRequestLogPo;
import com.ymatou.payment.infrastructure.db.model.RefundMiscRequestLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefundMiscRequestLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RefundMiscRequestLog
     *
     * @mbggenerated Mon Jun 13 13:47:39 CST 2016
     */
    int countByExample(RefundMiscRequestLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RefundMiscRequestLog
     *
     * @mbggenerated Mon Jun 13 13:47:39 CST 2016
     */
    int deleteByExample(RefundMiscRequestLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RefundMiscRequestLog
     *
     * @mbggenerated Mon Jun 13 13:47:39 CST 2016
     */
    int deleteByPrimaryKey(String logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RefundMiscRequestLog
     *
     * @mbggenerated Mon Jun 13 13:47:39 CST 2016
     */
    int insert(RefundMiscRequestLogWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RefundMiscRequestLog
     *
     * @mbggenerated Mon Jun 13 13:47:39 CST 2016
     */
    int insertSelective(RefundMiscRequestLogWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RefundMiscRequestLog
     *
     * @mbggenerated Mon Jun 13 13:47:39 CST 2016
     */
    List<RefundMiscRequestLogWithBLOBs> selectByExampleWithBLOBs(RefundMiscRequestLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RefundMiscRequestLog
     *
     * @mbggenerated Mon Jun 13 13:47:39 CST 2016
     */
    List<RefundMiscRequestLogPo> selectByExample(RefundMiscRequestLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RefundMiscRequestLog
     *
     * @mbggenerated Mon Jun 13 13:47:39 CST 2016
     */
    RefundMiscRequestLogWithBLOBs selectByPrimaryKey(String logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RefundMiscRequestLog
     *
     * @mbggenerated Mon Jun 13 13:47:39 CST 2016
     */
    int updateByExampleSelective(@Param("record") RefundMiscRequestLogWithBLOBs record, @Param("example") RefundMiscRequestLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RefundMiscRequestLog
     *
     * @mbggenerated Mon Jun 13 13:47:39 CST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") RefundMiscRequestLogWithBLOBs record, @Param("example") RefundMiscRequestLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RefundMiscRequestLog
     *
     * @mbggenerated Mon Jun 13 13:47:39 CST 2016
     */
    int updateByExample(@Param("record") RefundMiscRequestLogPo record, @Param("example") RefundMiscRequestLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RefundMiscRequestLog
     *
     * @mbggenerated Mon Jun 13 13:47:39 CST 2016
     */
    int updateByPrimaryKeySelective(RefundMiscRequestLogWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RefundMiscRequestLog
     *
     * @mbggenerated Mon Jun 13 13:47:39 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(RefundMiscRequestLogWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RefundMiscRequestLog
     *
     * @mbggenerated Mon Jun 13 13:47:39 CST 2016
     */
    int updateByPrimaryKey(RefundMiscRequestLogPo record);
}