package cn.com.tcsl.factorypattern;

/**
 * 黑种人
 * Created by libing on 2016/8/4.
 */
public class BlackHuman implements Human {

    @Override
    public void laugh() {
        System.out.println("黑种人类会笑");
    }

    @Override
    public void cry() {
        System.out.println("黑种人类会哭");
    }

    @Override
    public void talk() {
        System.out.println("黑种人类会说话");
    }

}
