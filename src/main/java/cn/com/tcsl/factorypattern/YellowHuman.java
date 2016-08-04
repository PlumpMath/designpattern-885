package cn.com.tcsl.factorypattern;

/**
 * 黄种人
 * Created by libing on 2016/8/4.
 */
public class YellowHuman implements Human {

    @Override
    public void laugh() {
        System.out.println("黄种人类会笑");
    }

    @Override
    public void cry() {
        System.out.println("黄种人类会哭");
    }

    @Override
    public void talk() {
        System.out.println("黄种人类会说话");
    }

}
