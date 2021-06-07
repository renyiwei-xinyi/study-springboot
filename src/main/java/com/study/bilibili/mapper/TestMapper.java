package com.study.bilibili.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.bilibili.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TestMapper extends BaseMapper<UserInfo> {

     UserInfo getUserById(@Param("id") Integer id);
}
