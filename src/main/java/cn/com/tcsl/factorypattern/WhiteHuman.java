package cn.com.tcsl.factorypattern;

/**
 * 白种人
 * Created by libing on 2016/8/4.
 */
public class WhiteHuman implements Human {

    @Override
    public void laugh() {
        System.out.println("白种人类会笑");
    }

    @Override
    public void cry() {
        System.out.println("白种人类会哭");
    }

    @Override
    public void talk() {
        System.out.println("白种人类会说话");
    }

}
