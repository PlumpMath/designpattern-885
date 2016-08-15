package cn.com.tcsl.adapterpattern;

/**
 * 用户信息对象
 * Created by libing on 2016/8/15.
 */
public interface IUserInfo {

    /**
     * 获得用户姓名
     * @return
     */
    public String getUserName();

    /**
     * 获得家庭地址
     * @return
     */
    public String getHomeAddress();

    /**
     * 获得手机号码
     * @return
     */
    public String getMobileNumber();

    /**
     * 获得办公电话
     * @return
     */
    public String getOfficeTelNumber();

    /**
     * 获得工作职位
     * @return
     */
    public String getJobPosition();

    /**
     * 获得家庭电话
     * @return
     */
    public String getHomeTelNumber();

}
