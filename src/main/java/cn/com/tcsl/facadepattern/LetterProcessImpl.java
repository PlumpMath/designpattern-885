package cn.com.tcsl.facadepattern;

/**
 * 写信的具体实现
 * Created by libing on 2016/8/15.
 */
public class LetterProcessImpl implements LetterProcess {

    /**
     * 写信
     * @param context
     */
    @Override
    public void writeContext(String context) {
        System.out.println("填写信的内容......" + context);
    }

    /**
     * 写信封
     * @param address
     */
    @Override
    public void fileEnvelope(String address) {
        System.out.println("填写信封的内容......" + address);
    }

    /**
     * 封信
     */
    @Override
    public void letterInotoEnvelope() {
        System.out.println("把信封好......");
    }

    /**
     * 送信
     */
    @Override
    public void sendLetter() {
        System.out.println("送信......");
    }

}
