package com.imooc.user.service;

import com.imooc.user.dataobject.UserInfo;

/**
 * Created by SJW
 * 2018-03-04 21:44
 */
public interface UserInfoService {

    /**
     * 通过openid来查询用户信息
     * @param openid
     * @return
     */
    UserInfo findByOpenid(String openid);
}
