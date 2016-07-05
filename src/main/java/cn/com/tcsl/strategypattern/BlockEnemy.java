/*
 * Copyright (c) 2016 libing. All rights reserved.
 */
package cn.com.tcsl.strategypattern;

/**
 * <P>
 * Description:策略   阻挡敌人
 * </p>
 * @author libing
 * @version 1.0
 * @Date 2016年7月5日上午10:31:10
 */
public class BlockEnemy implements IStrategy {

    @Override
    public void operate() {
        System.out.println("阻止敌人。。。");
    }

}
