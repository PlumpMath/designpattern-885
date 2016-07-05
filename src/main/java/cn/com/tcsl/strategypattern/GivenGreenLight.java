/*
 * Copyright (c) 2016 libing. All rights reserved.
 */
package cn.com.tcsl.strategypattern;

/**
 * <P>
 * Description:策略 开绿灯
 * </p>
 * @author libing
 * @version 1.0
 * @Date 2016年7月5日上午10:28:17
 */
public class GivenGreenLight implements IStrategy {

    @Override
    public void operate() {
        System.out.println("开绿灯放行。。。");
    }

}
