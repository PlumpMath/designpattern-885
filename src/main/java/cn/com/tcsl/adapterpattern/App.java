package cn.com.tcsl.adapterpattern;

/**
 * Created by libing on 2016/8/24.
 */
public class App {

    public static void main(String[] args) {
        // 没有外系统连接的时候，这样写
//        IUserInfo youngGirl = new UserInfo();

        // 外包人员管理
        IUserInfo youngGirl = new OuterUserInfo();

        // 从数据库中查到101个
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }
    }

}
