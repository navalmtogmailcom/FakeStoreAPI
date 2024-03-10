package com.scaler.resttemplatepractice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestProdController {

    private  RestProdService restProdService;
    public RestProdController(RestProdService restProdService){
        this.restProdService = restProdService;
    }
    @GetMapping("/products/{id}")
    public ResponseEntity getProdById(@PathVariable("id") int prodId){
        FakeProduct product  = restProdService.getProdById(prodId);
        return ResponseEntity.ok(product);
    }

}

