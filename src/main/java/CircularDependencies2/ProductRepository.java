package CircularDependencies2;


public class ProductRepository {

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    private ProductService productService;

}
