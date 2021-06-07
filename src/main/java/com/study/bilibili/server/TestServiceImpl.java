package com.study.bilibili.server;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.bilibili.api.TestService;
import com.study.bilibili.entity.UserInfo;
import com.study.bilibili.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, UserInfo> implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public String test() {
        return "Hello Word";
    }

    @Override
    public UserInfo getUserById(Integer id) {
        return testMapper.getUserById(id);
    }
}
