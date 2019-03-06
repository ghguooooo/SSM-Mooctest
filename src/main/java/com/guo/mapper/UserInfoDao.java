package com.guo.mapper;

import com.guo.domain.UserInfo;

public interface UserInfoDao {
    public UserInfo selectUserInfoByUsername(String username) throws Exception;
}
