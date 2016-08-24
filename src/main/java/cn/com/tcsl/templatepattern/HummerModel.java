package cn.com.tcsl.templatepattern;

/**
 * Created by libing on 2016/8/24.
 */
public abstract class HummerModel {

    /**
     * 启动
     */
    public abstract void start();

    /**
     * 停止
     */
    public abstract void stop();

    /**
     * 警报
     */
    public abstract void alarm();

    /**
     * 引擎响
     */
    public abstract void engineBoom();

    /**
     * 运动
     */
    public void run() {
        System.out.println("Hummer run ......");
    }

}
