package cn.com.tcsl.templatepattern;

/**
 * Created by libing on 2016/8/24.
 */
public class Client {

    public static void main(String[] args) {
        HummerH1Model hummerH1Model = new HummerH1Model();
        hummerH1Model.run();

        HummerH2Model hummerH2Model = new HummerH2Model();
        hummerH2Model.run();
    }

}
