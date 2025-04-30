package com.skyll.SimpleWebApp.Service;

import com.skyll.SimpleWebApp.Model.product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<product>products= Arrays.asList(new product(101,"Ganesh",10000),
                                         new product(102,"Rakesh",20000),
                                         new product(103,"Prasad",30000));

    public List<product> getProducts() {
        return products;

    }

}
