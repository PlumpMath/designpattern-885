package cn.com.tcsl.adapterpattern;

/**
 * 某员工信息
 * Created by libing on 2016/8/15.
 */
public class UserInfo implements IUserInfo {

    @Override
    public String getUserName() {
        System.out.println("员工姓名是......");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("员工家庭地址是......");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("员工手机号是......");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("员工办公电话是......");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("员工工作职位是......");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("员工家庭电话是......");
        return null;
    }

}
