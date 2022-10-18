package com.example.controller;

import com.example.model.Product;
import com.example.service.Productserviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Productcontroller {
    @Autowired
    Productserviceimpl controllerimpl;

    @PostMapping("/savedata")
    public String savedata(@RequestBody Product product) {
        controllerimpl.savedata(product);
        return " data saved successfully";
    }

    @GetMapping("/getalldata")
    public List<Product> getalldata() {
        return controllerimpl.getalldata();
    }

    @PutMapping("/updatedata/{productid}")
    public String update(@PathVariable int productid, @RequestBody Product product){
        controllerimpl.update(productid,product);
        return "data updated succesfully";
}
@DeleteMapping("deletedata/{productid}")
    public void deletedatat(@PathVariable int productid)

{
    controllerimpl.deletedata(productid);
}

}
