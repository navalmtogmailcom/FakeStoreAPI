package com.scaler.resttemplatepractice;


import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestProdService {
    private RestTemplate restTemplate;

    public RestProdService(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }
    public FakeProduct getProdById(int id) {
        String fakeurl = "https://fakestoreapi.com/products/"+ id;
        ResponseEntity<FakeProduct> responseEntity = restTemplate.getForEntity(fakeurl, FakeProduct.class);
       // System.out.println(responseEntity);
        return responseEntity.getBody();

    }
}