package RegisterBean1;

import lombok.val;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class Main {
    //结论：可以通过BeanFactory的registerSingleton方式手动注册对象;也可以通过registerBeanDefinition注册对象

    public static void main(String[] args) {
        // 方式一 直接注册单例对象
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//        beanFactory.registerSingleton("dog", new Dog());
//        Dog dog = beanFactory.getBean(Dog.class);
//        System.out.println(dog);

        // 方式二 生成beanDefinition，直接注册 BeanDefinition
        val beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(Dog.class);
        beanFactory.registerBeanDefinition("dog", beanDefinitionBuilder.getBeanDefinition());
        val dogBeanDefiniton = beanFactory.getBeanDefinition("dog");
        System.out.println(dogBeanDefiniton);
        val dog2 = beanFactory.getBean("dog");
        System.out.println(dog2);
    }
}
