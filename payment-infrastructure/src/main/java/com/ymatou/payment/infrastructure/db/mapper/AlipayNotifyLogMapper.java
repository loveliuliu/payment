package com.ymatou.payment.infrastructure.db.mapper;

import com.ymatou.payment.infrastructure.db.model.AlipayNotifyLogExample;
import com.ymatou.payment.infrastructure.db.model.AlipayNotifyLogPo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlipayNotifyLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ymt_AlipayNotifyLog
     *
     * @mbggenerated Mon Feb 27 18:24:23 CST 2017
     */
    int countByExample(AlipayNotifyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ymt_AlipayNotifyLog
     *
     * @mbggenerated Mon Feb 27 18:24:23 CST 2017
     */
    int deleteByExample(AlipayNotifyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ymt_AlipayNotifyLog
     *
     * @mbggenerated Mon Feb 27 18:24:23 CST 2017
     */
    int deleteByPrimaryKey(Integer iId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ymt_AlipayNotifyLog
     *
     * @mbggenerated Mon Feb 27 18:24:23 CST 2017
     */
    int insert(AlipayNotifyLogPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ymt_AlipayNotifyLog
     *
     * @mbggenerated Mon Feb 27 18:24:23 CST 2017
     */
    int insertSelective(AlipayNotifyLogPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ymt_AlipayNotifyLog
     *
     * @mbggenerated Mon Feb 27 18:24:23 CST 2017
     */
    List<AlipayNotifyLogPo> selectByExampleWithBLOBs(AlipayNotifyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ymt_AlipayNotifyLog
     *
     * @mbggenerated Mon Feb 27 18:24:23 CST 2017
     */
    List<AlipayNotifyLogPo> selectByExample(AlipayNotifyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ymt_AlipayNotifyLog
     *
     * @mbggenerated Mon Feb 27 18:24:23 CST 2017
     */
    AlipayNotifyLogPo selectByPrimaryKey(Integer iId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ymt_AlipayNotifyLog
     *
     * @mbggenerated Mon Feb 27 18:24:23 CST 2017
     */
    int updateByExampleSelective(@Param("record") AlipayNotifyLogPo record, @Param("example") AlipayNotifyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ymt_AlipayNotifyLog
     *
     * @mbggenerated Mon Feb 27 18:24:23 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") AlipayNotifyLogPo record, @Param("example") AlipayNotifyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ymt_AlipayNotifyLog
     *
     * @mbggenerated Mon Feb 27 18:24:23 CST 2017
     */
    int updateByExample(@Param("record") AlipayNotifyLogPo record, @Param("example") AlipayNotifyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ymt_AlipayNotifyLog
     *
     * @mbggenerated Mon Feb 27 18:24:23 CST 2017
     */
    int updateByPrimaryKeySelective(AlipayNotifyLogPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ymt_AlipayNotifyLog
     *
     * @mbggenerated Mon Feb 27 18:24:23 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(AlipayNotifyLogPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ymt_AlipayNotifyLog
     *
     * @mbggenerated Mon Feb 27 18:24:23 CST 2017
     */
    int updateByPrimaryKey(AlipayNotifyLogPo record);
}