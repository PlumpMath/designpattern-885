package cn.com.tcsl.facadepattern;

/**
 * 便民化写信
 * Created by libing on 2016/8/15.
 */
public class ModenPostOffice {

    private LetterProcess letterProcess = new LetterProcessImpl();

    private Police police = new Police();

    /**
     * 自动化写信
     * @param context
     * @param address
     */
    public void sendLetter(String context, String address) {
        // 帮你写信
        letterProcess.writeContext(context);
        // 帮你写信封
        letterProcess.fileEnvelope(address);
        // 检查
        police.checkLetter(letterProcess);
        // 帮你把信封好
        letterProcess.letterInotoEnvelope();
        // 邮递信件
        letterProcess.sendLetter();
    }

}
