/*
 * Copyright (c) 2016 libing. All rights reserved.
 */
package cn.com.tcsl.strategypattern;

/**
 * <P>
 * Description:策略   后门策略
 * </p>
 * @author libing
 * @version 1.0
 * @Date 2016年7月5日上午10:25:51
 */
public class BackDoor implements IStrategy {

    @Override
    public void operate() {
        System.out.println("后门施加压力。。。");
    }

}
