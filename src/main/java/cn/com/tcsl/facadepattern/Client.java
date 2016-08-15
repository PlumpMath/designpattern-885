package cn.com.tcsl.facadepattern;

/**
 * 使用自动化写信
 * Created by libing on 2016/8/15.
 */
public class Client {

    public static void main(String[] args) {
        // 自动化邮局
        ModenPostOffice modenPostOffice = new ModenPostOffice();

        // 填写地址与内容，然后放心交给自动化邮局去运作
        String address = "earth";
        String context = "nothing to say";
        modenPostOffice.sendLetter(context, address);
    }

}
