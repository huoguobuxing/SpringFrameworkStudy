import CircularDependencies1.ProductService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLog {
    Log logger = LogFactory.getLog(TestLog.class);

    public void testLog() {
        logger.info("test..........");
    }

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        ProductService productService = context.getBean("productService", ProductService.class);
        context.getBeanDefinitionNames();
        productService.findProductById(1);
    }
}
