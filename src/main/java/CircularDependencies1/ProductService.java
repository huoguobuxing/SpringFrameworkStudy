package CircularDependencies1;

public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public String findProductById(Integer id) {
        return productRepository.findById();
    }
}
