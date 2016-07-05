/*
 * Copyright (c) 2016 libing. All rights reserved.
 */
package cn.com.tcsl.strategypattern;

/**
 * <P>
 * Description:赵云执行锦囊妙计
 * </p>
 * @author libing
 * @version 1.0
 * @Date 2016年7月5日上午10:37:00
 */
public class ZhaoYun {

    public static void main(String[] args) {
        Context context;
        System.out.println("执行第一个锦囊。。。");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("\n执行第二个锦囊。。。");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println("\n执行第三个锦囊。。。");
        context = new Context(new BlockEnemy());
        context.operate();
    }

}
