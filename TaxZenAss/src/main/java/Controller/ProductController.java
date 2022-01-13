package Controller;

import Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import view.ProductRequest;
import view.ProductResponse;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class ProductController {

    @Autowired
    ProductService service;

    @PostMapping
    public List<ProductResponse> getPurchasedItems(@RequestBody ProductRequest request){
        return service.vendingMachine(request);
    }
}
