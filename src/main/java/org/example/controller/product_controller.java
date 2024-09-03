package org.example.controller;

import org.example.model.productModel;
import org.example.repository.product_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class product_controller
{

    @Autowired
   private product_repo productRepo;

    @PostMapping("/add")
    @CrossOrigin(origins = "https://localhost:8090")
    public void add(@RequestBody productModel productModel)
    {
        productRepo.save(productModel);
        System.out.println(productModel.toString());
    }

    @GetMapping("/get")
    @CrossOrigin(origins = "http://localhost")
    public List<productModel> getAll()
    {
        System.out.println("+++++"+productRepo.findAll());
        return productRepo.findAll();
    }
}
