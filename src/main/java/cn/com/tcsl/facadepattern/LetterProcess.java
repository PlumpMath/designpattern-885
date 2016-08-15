package cn.com.tcsl.facadepattern;

/**
 * 定义一个写信的过程
 * Created by libing on 2016/8/15.
 */
public interface LetterProcess {

    /**
     * 写信
     * @param context
     */
    public void writeContext(String context);

    /**
     * 写信封
     * @param address
     */
    public void fileEnvelope(String address);

    /**
     * 封信
     */
    public void letterInotoEnvelope();

    /**
     * 送信
     */
    public void sendLetter();

}
