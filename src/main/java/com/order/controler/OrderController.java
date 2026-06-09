package com.order.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {


    @GetMapping(consumes = "application/json", produces = "application/json")
    @RequestMapping("/getorderinfo")
    public String getOrderDetails(){



        return "orderid: 5456666, productid: 'G452212' product_name: 'Samsung Mobile'";
    }



}
