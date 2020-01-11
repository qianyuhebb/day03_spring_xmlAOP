package com.tc.service;

/**
 * 时间：  2020/1/11
 * 创建者：  Administrator 钟文
 * 描述：
 * 参数：
 * 返回值：
 **/
public interface IAccountService {

    /**
     * 模拟保存账户
     */
    void saveAccount();


   void updateAccount(int id);


   int deleteAccount();
}
