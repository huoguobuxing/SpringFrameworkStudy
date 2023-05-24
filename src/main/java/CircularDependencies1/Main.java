package CircularDependencies1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    //结论：当两个bean通过构造函数互相依赖时，Spring就无法创建对象
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("CircularDependencies1.xml");
        ProductService productService = context.getBean("productService", ProductService.class);
        System.out.println(productService);
    }
}
