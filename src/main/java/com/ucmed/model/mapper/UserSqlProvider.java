package com.ucmed.model.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.ucmed.model.bean.User;

public class UserSqlProvider {

    public String insertSelective(User record) {
        BEGIN();
        INSERT_INTO("user");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getHospitalId() != null) {
            VALUES("hospital_id", "#{hospitalId,jdbcType=INTEGER}");
        }
        
        if (record.getHospitalUserId() != null) {
            VALUES("hospital_user_id", "#{hospitalUserId,jdbcType=INTEGER}");
        }
        
        if (record.getLoginName() != null) {
            VALUES("login_name", "#{loginName,jdbcType=VARCHAR}");
        }
        
        if (record.getLoginPassword() != null) {
            VALUES("login_password", "#{loginPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getRealName() != null) {
            VALUES("real_name", "#{realName,jdbcType=VARCHAR}");
        }
        
        if (record.getIdCard() != null) {
            VALUES("id_card", "#{idCard,jdbcType=VARCHAR}");
        }
        
        if (record.getTreatmentCardNumber() != null) {
            VALUES("treatment_card_number", "#{treatmentCardNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            VALUES("sex", "#{sex,jdbcType=CHAR}");
        }
        
        if (record.getPhone() != null) {
            VALUES("phone", "#{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getProvince() != null) {
            VALUES("province", "#{province,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            VALUES("city", "#{city,jdbcType=VARCHAR}");
        }
        
        if (record.getSecurityKey() != null) {
            VALUES("security_key", "#{securityKey,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastLoginTime() != null) {
            VALUES("last_login_time", "#{lastLoginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getBirthday() != null) {
            VALUES("birthday", "#{birthday,jdbcType=VARCHAR}");
        }
        
        if (record.getLoginTimes() != null) {
            VALUES("login_times", "#{loginTimes,jdbcType=INTEGER}");
        }
        
        if (record.getPhoto() != null) {
            VALUES("photo", "#{photo,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            VALUES("address", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdateTime() != null) {
            VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMedicareType() != null) {
            VALUES("medicare_type", "#{medicareType,jdbcType=CHAR}");
        }
        
        if (record.getBlackList() != null) {
            VALUES("black_list", "#{blackList,jdbcType=CHAR}");
        }
        
        if (record.getIsDelete() != null) {
            VALUES("is_delete", "#{isDelete,jdbcType=CHAR}");
        }
        
        if (record.getWechat() != null) {
            VALUES("wechat", "#{wechat,jdbcType=VARCHAR}");
        }
        
        if (record.getEquipmentId() != null) {
            VALUES("equipment_id", "#{equipmentId,jdbcType=CHAR}");
        }
        
        if (record.getAliUserId() != null) {
            VALUES("ali_user_id", "#{aliUserId,jdbcType=VARCHAR}");
        }
        
        if (record.getExtendParams() != null) {
            VALUES("extend_params", "#{extendParams,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(User record) {
        BEGIN();
        UPDATE("user");
        
        if (record.getHospitalId() != null) {
            SET("hospital_id = #{hospitalId,jdbcType=INTEGER}");
        }
        
        if (record.getHospitalUserId() != null) {
            SET("hospital_user_id = #{hospitalUserId,jdbcType=INTEGER}");
        }
        
        if (record.getLoginName() != null) {
            SET("login_name = #{loginName,jdbcType=VARCHAR}");
        }
        
        if (record.getLoginPassword() != null) {
            SET("login_password = #{loginPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getRealName() != null) {
            SET("real_name = #{realName,jdbcType=VARCHAR}");
        }
        
        if (record.getIdCard() != null) {
            SET("id_card = #{idCard,jdbcType=VARCHAR}");
        }
        
        if (record.getTreatmentCardNumber() != null) {
            SET("treatment_card_number = #{treatmentCardNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            SET("sex = #{sex,jdbcType=CHAR}");
        }
        
        if (record.getPhone() != null) {
            SET("phone = #{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getProvince() != null) {
            SET("province = #{province,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            SET("city = #{city,jdbcType=VARCHAR}");
        }
        
        if (record.getSecurityKey() != null) {
            SET("security_key = #{securityKey,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastLoginTime() != null) {
            SET("last_login_time = #{lastLoginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getBirthday() != null) {
            SET("birthday = #{birthday,jdbcType=VARCHAR}");
        }
        
        if (record.getLoginTimes() != null) {
            SET("login_times = #{loginTimes,jdbcType=INTEGER}");
        }
        
        if (record.getPhoto() != null) {
            SET("photo = #{photo,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            SET("address = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdateTime() != null) {
            SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMedicareType() != null) {
            SET("medicare_type = #{medicareType,jdbcType=CHAR}");
        }
        
        if (record.getBlackList() != null) {
            SET("black_list = #{blackList,jdbcType=CHAR}");
        }
        
        if (record.getIsDelete() != null) {
            SET("is_delete = #{isDelete,jdbcType=CHAR}");
        }
        
        if (record.getWechat() != null) {
            SET("wechat = #{wechat,jdbcType=VARCHAR}");
        }
        
        if (record.getEquipmentId() != null) {
            SET("equipment_id = #{equipmentId,jdbcType=CHAR}");
        }
        
        if (record.getAliUserId() != null) {
            SET("ali_user_id = #{aliUserId,jdbcType=VARCHAR}");
        }
        
        if (record.getExtendParams() != null) {
            SET("extend_params = #{extendParams,jdbcType=VARCHAR}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }
}