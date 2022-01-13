package Service;

import Entity.Product;
import jpa.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import view.ProductRequest;
import view.ProductResponse;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public List<ProductResponse> vendingMachine(ProductRequest request){
        List<Product> productList = repository.findAll();
        List<ProductResponse> purchasedItems = null;
        for (Product product : productList){
            if (product.getPrice() <= request.getPrice()){
                ProductResponse addItem = new ProductResponse();
                addItem.setName(product.getName);
                addItem.setChange(request.getPrice()-request.getPrice());
                purchasedItems.add(addItem);
            }

        }
        return purchasedItems;
    }

}
