package com.study.bilibili.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class UserInfo {

    private Integer id;

    private String email;

    private String nickname;

    private String avatar;

    private String intro;

    private String web_site;

    private Date create_time;

    private Date update_time;

    private Integer is_disable;

}
