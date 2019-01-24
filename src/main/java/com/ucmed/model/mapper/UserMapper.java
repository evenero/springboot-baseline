package com.ucmed.model.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

import com.ucmed.model.bean.User;

@Mapper
public interface UserMapper {
    @Delete({
        "delete from user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into user (id, hospital_id, ",
        "hospital_user_id, login_name, ",
        "login_password, real_name, ",
        "id_card, treatment_card_number, ",
        "sex, phone, province, ",
        "city, security_key, ",
        "create_time, last_login_time, ",
        "birthday, login_times, ",
        "photo, address, ",
        "update_time, medicare_type, ",
        "black_list, is_delete, wechat, ",
        "equipment_id, ali_user_id, ",
        "extend_params)",
        "values (#{id,jdbcType=INTEGER}, #{hospitalId,jdbcType=INTEGER}, ",
        "#{hospitalUserId,jdbcType=INTEGER}, #{loginName,jdbcType=VARCHAR}, ",
        "#{loginPassword,jdbcType=VARCHAR}, #{realName,jdbcType=VARCHAR}, ",
        "#{idCard,jdbcType=VARCHAR}, #{treatmentCardNumber,jdbcType=VARCHAR}, ",
        "#{sex,jdbcType=CHAR}, #{phone,jdbcType=VARCHAR}, #{province,jdbcType=VARCHAR}, ",
        "#{city,jdbcType=VARCHAR}, #{securityKey,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{lastLoginTime,jdbcType=TIMESTAMP}, ",
        "#{birthday,jdbcType=VARCHAR}, #{loginTimes,jdbcType=INTEGER}, ",
        "#{photo,jdbcType=VARCHAR}, #{address,jdbcType=VARCHAR}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{medicareType,jdbcType=CHAR}, ",
        "#{blackList,jdbcType=CHAR}, #{isDelete,jdbcType=CHAR}, #{wechat,jdbcType=VARCHAR}, ",
        "#{equipmentId,jdbcType=CHAR}, #{aliUserId,jdbcType=VARCHAR}, ",
        "#{extendParams,jdbcType=VARCHAR})"
    })
    int insert(User record);

    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(User record);

    @Select({
        "select",
        "id, hospital_id, hospital_user_id, login_name, login_password, real_name, id_card, ",
        "treatment_card_number, sex, phone, province, city, security_key, create_time, ",
        "last_login_time, birthday, login_times, photo, address, update_time, medicare_type, ",
        "black_list, is_delete, wechat, equipment_id, ali_user_id, extend_params",
        "from user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="hospital_id", property="hospitalId", jdbcType=JdbcType.INTEGER),
        @Result(column="hospital_user_id", property="hospitalUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="login_name", property="loginName", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_password", property="loginPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="real_name", property="realName", jdbcType=JdbcType.VARCHAR),
        @Result(column="id_card", property="idCard", jdbcType=JdbcType.VARCHAR),
        @Result(column="treatment_card_number", property="treatmentCardNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.CHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="security_key", property="securityKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_login_time", property="lastLoginTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="birthday", property="birthday", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_times", property="loginTimes", jdbcType=JdbcType.INTEGER),
        @Result(column="photo", property="photo", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="medicare_type", property="medicareType", jdbcType=JdbcType.CHAR),
        @Result(column="black_list", property="blackList", jdbcType=JdbcType.CHAR),
        @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.CHAR),
        @Result(column="wechat", property="wechat", jdbcType=JdbcType.VARCHAR),
        @Result(column="equipment_id", property="equipmentId", jdbcType=JdbcType.CHAR),
        @Result(column="ali_user_id", property="aliUserId", jdbcType=JdbcType.VARCHAR),
        @Result(column="extend_params", property="extendParams", jdbcType=JdbcType.VARCHAR)
    })
    User selectByPrimaryKey(Integer id);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    @Update({
        "update user",
        "set hospital_id = #{hospitalId,jdbcType=INTEGER},",
          "hospital_user_id = #{hospitalUserId,jdbcType=INTEGER},",
          "login_name = #{loginName,jdbcType=VARCHAR},",
          "login_password = #{loginPassword,jdbcType=VARCHAR},",
          "real_name = #{realName,jdbcType=VARCHAR},",
          "id_card = #{idCard,jdbcType=VARCHAR},",
          "treatment_card_number = #{treatmentCardNumber,jdbcType=VARCHAR},",
          "sex = #{sex,jdbcType=CHAR},",
          "phone = #{phone,jdbcType=VARCHAR},",
          "province = #{province,jdbcType=VARCHAR},",
          "city = #{city,jdbcType=VARCHAR},",
          "security_key = #{securityKey,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "last_login_time = #{lastLoginTime,jdbcType=TIMESTAMP},",
          "birthday = #{birthday,jdbcType=VARCHAR},",
          "login_times = #{loginTimes,jdbcType=INTEGER},",
          "photo = #{photo,jdbcType=VARCHAR},",
          "address = #{address,jdbcType=VARCHAR},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "medicare_type = #{medicareType,jdbcType=CHAR},",
          "black_list = #{blackList,jdbcType=CHAR},",
          "is_delete = #{isDelete,jdbcType=CHAR},",
          "wechat = #{wechat,jdbcType=VARCHAR},",
          "equipment_id = #{equipmentId,jdbcType=CHAR},",
          "ali_user_id = #{aliUserId,jdbcType=VARCHAR},",
          "extend_params = #{extendParams,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User record);
}