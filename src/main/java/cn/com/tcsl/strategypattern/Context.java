/*
 * Copyright (c) 2016 libing. All rights reserved.
 */
package cn.com.tcsl.strategypattern;

/**
 * <P>
 * Description:锦囊
 * </p>
 * @author libing
 * @version 1.0
 * @Date 2016年7月5日上午10:33:26
 */
public class Context {

    // 锦囊
    private IStrategy strategy;

    // 构造锦囊
    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    // 执行锦囊
    public void operate() {
        this.strategy.operate();
    }

}
