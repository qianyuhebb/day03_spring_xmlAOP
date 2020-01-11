package com.tc.service.impl;

import com.tc.service.IAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 时间：  2020/1/11
 * 创建者：  Administrator 钟文
 * 描述：
 * 参数：
 * 返回值：
 **/
public class IAccountServiceImpl implements IAccountService {


    // 首先获得日志记录这个对象
    static private Logger logger = LoggerFactory.getLogger(IAccountServiceImpl.class);

    public void saveAccount() {
        System.out.println("执行了保存");
        logger.info("测试日志使用");

    }

    public void updateAccount(int id) {
        System.out.println("执行了更新");
    }

    public int deleteAccount() {
        System.out.println("执行了删除");
        return 0;
    }
}
