package cn.com.tcsl.factorypattern;

import java.util.List;
import java.util.Random;

/**
 * 工厂类
 * Created by libing on 2016/8/4.
 */
public class HumanFactory {

    // 定义一个工厂方法
    public static Human createHuman(Class c) {
        Human human = null;

        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            System.out.println("必须指定人类的肤色");
        } catch (IllegalAccessException e) {
            System.out.println("人类定义错误");
        } catch (ClassNotFoundException e) {
            System.out.println("指定的人类找不到");
        }

        return human;
    }

    /**
     * 随机的创建人类
     * @return Human 人类
     */
    public static Human createHuman() {
        // 定义一个类型的人类
        Human human = null;

        // 首先是获得有多少个实现类，多少个人类
        List<Class> concreteHumanList = ClassUtils.getAllClassByInterface(Human.class);

        // 工厂自己随机选择某种肤色的人类进行创建
        Random random = new Random();
        int rand = random.nextInt(concreteHumanList.size());
        human = createHuman(concreteHumanList.get(rand));

        return human;
    }

}
