package com.company.model;

public abstract class Product {
    String name;
    Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Double calcule(Integer quantidadeOfProdutos) {
        Double tot = this.price*quantidadeOfProdutos;
        System.out.println(tot);
        return tot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String toString() {
        return "Pessoa{" +
                "Nome='" + name + '\'' +
                ", id='" + price + '\'' +
                '}';
    }

}
