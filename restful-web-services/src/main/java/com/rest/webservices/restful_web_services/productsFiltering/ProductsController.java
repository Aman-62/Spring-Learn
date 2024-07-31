package com.rest.webservices.restful_web_services.productsFiltering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class ProductsController {

    @GetMapping("/products")
    public MappingJacksonValue filtering() {
        Product product = new Product(1, "RC Car", "this is our First RC car.");

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(product);

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id", "name");

        FilterProvider filters = new SimpleFilterProvider().addFilter("ProductsFiltration", filter);

        mappingJacksonValue.setFilters(filters);

        return mappingJacksonValue;
    }

    @GetMapping("/products-list")
    public MappingJacksonValue filteringList() {
        List<Product> list = Arrays.asList(new Product(1, "RC Car", "this is our First RC car."),
                new Product(2, "RC Bike", "this is our First RC bike."),
                new Product(3, "RC Ship", "this is our First RC ship."));

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(list);

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id", "name", "description");

        FilterProvider filters = new SimpleFilterProvider().addFilter("ProductsFiltration", filter);

        mappingJacksonValue.setFilters(filters);

        return mappingJacksonValue;
    }
}
