package CircularDependencies1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ProductRepository {
    Log log = LogFactory.getLog(ProductRepository.class);

    public ProductRepository(ProductService productService) {
        this.productService = productService;
    }

    private ProductService productService;

    public String findById() {
        log.info("CircularDependencies1.ProductRepository.findById");
        return null;
    }
}
