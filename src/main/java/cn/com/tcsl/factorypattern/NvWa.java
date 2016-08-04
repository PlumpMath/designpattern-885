package cn.com.tcsl.factorypattern;

/**
 * Created by libing on 2016/8/4.
 */
public class NvWa {

    public static void main(String[] args) {
        System.out.println("------造出第一批白人------");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.laugh();
        whiteHuman.cry();
        whiteHuman.talk();

        System.out.println("------造出第一批黑人------");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.laugh();
        blackHuman.cry();
        blackHuman.talk();

        System.out.println("------造出第一批黄人------");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.laugh();
        yellowHuman.cry();
        yellowHuman.talk();

        for (int i = 0; i < 10; i++) {
            System.out.println("------随机的创造人类------" + i);
            Human human = HumanFactory.createHuman();
            human.laugh();
            human.cry();
            human.talk();
        }
    }

}
