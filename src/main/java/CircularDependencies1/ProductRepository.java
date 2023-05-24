package CircularDependencies1;

public class ProductRepository {

    public ProductRepository(ProductService productService) {
        this.productService = productService;
    }

    private ProductService productService;

}
