package com.example.demo.controllers;

import com.example.demo.entities.Customer;
import com.example.demo.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customers")

public class CustomerController {
    @Autowired
    private CustomerServices customerServices;
     @GetMapping("/all")
     public String getAllCustomers(Model model) {
         List<Customer> customers = customerServices.getAllCustomers();
         model.addAttribute("customers", customerServices.getAllCustomers());
         return "List_customers";
    }

}
