package CircularDependencies2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    //结论：当两个bean通过属性互相依赖时，Spring可以正确创建对象
    //原理：spring创建对象分三级，由于对象的构造函数不受影响，所以对象是可以 new 出来的，new出来的半成品可以暂时放到半成品对象里，
    //待所有半成品都搞定后，再进行关联
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("CircularDependencies2.xml");
        ProductService productService = context.getBean("productService", ProductService.class);
        System.out.println(productService);
    }
}
