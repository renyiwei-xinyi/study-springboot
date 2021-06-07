package com.study.bilibili.api;

import com.baomidou.mybatisplus.extension.service.IService;
import com.study.bilibili.entity.UserInfo;

public interface TestService extends IService<UserInfo> {

    String test();

    UserInfo getUserById(Integer id);
}
