package com.rest.webservices.restful_web_services.productsFiltering;

import com.fasterxml.jackson.annotation.JsonFilter;

// @JsonIgnoreProperties({ "description", "id" })
@JsonFilter("ProductsFiltration")
public class Product {
    int id;
    String name;

    // @JsonIgnore
    String description;

    public Product(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", description=" + description + "]";
    }

}
