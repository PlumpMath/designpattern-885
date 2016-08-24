package cn.com.tcsl.adapterpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by libing on 2016/8/24.
 */
public class OuterUser implements IOuterUser {

    @Override
    public Map getUserBaseInfo() {
        Map baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "lee");
        baseInfoMap.put("mobileNumber", "telno is ......");
        return baseInfoMap;
    }

    @Override
    public Map getUserOfficeInfo() {
        Map officeInfoMap = new HashMap();
        officeInfoMap.put("jobPosition", "boss");
        officeInfoMap.put("officeTelNumber", "office telno is ......");
        return officeInfoMap;
    }

    @Override
    public Map getUserHomeInfo() {
        Map homeInfoMap = new HashMap();
        homeInfoMap.put("homeTelNumber", "home telno is ......");
        homeInfoMap.put("homeAddress", "home address is ......");
        return homeInfoMap;
    }

}
