package CircularDependencies1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        ProductService productService = context.getBean("productService", ProductService.class);
        context.getBeanDefinitionNames();
        productService.findProductById(1);
    }
}
