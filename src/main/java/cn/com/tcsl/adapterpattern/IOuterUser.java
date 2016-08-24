package cn.com.tcsl.adapterpattern;

import java.util.Map;

/**
 * Created by libing on 2016/8/24.
 */
public interface IOuterUser {

    /**
     * 基本信息，比如姓名、性别、手机号等
     * @return
     */
    public Map getUserBaseInfo();

    /**
     * 工作区域信息
     * @return
     */
    public Map getUserOfficeInfo();

    /**
     * 用户的家庭信息
     * @return
     */
    public Map getUserHomeInfo();

}
