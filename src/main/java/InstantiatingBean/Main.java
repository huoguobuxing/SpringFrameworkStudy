package InstantiatingBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    // 结论：bean的三种实例化方法
    public static void main(String[] args) {
        // 方式一 直接使用bean类名称。其实就是空构造函数实现实例化
        ApplicationContext context = new ClassPathXmlApplicationContext("InstantiatingBean.xml");
        Dog dog = context.getBean("dog1", Dog.class);
        System.out.println(dog);
        // 方式二 使用类的静态方法
        Dog dog2 = context.getBean("dog2", Dog.class);
        System.out.println(dog2);
        // 方式三 使用已经注册的bean的实例方法
        Dog dog3 = context.getBean("dog3", Dog.class);
        System.out.println(dog3);

    }
}
