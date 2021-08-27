package com.company.model;

import java.util.List;

public class NonPerishable extends Product {
    private String type;

    @Override
    public Double calcule(Integer quantidadeOfProdutos) {
        return super.calcule(quantidadeOfProdutos);
    }

    public static void totalNonPerishable(List<NonPerishable> naoPereciveis, Integer quantidade) {
        Double total = 0d;
        for (NonPerishable item : naoPereciveis) {
            total += item.calcule(quantidade);
        }
        System.out.println(total);
    }

    @Override
    public String toString() {
        return "NonPerishable{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public NonPerishable(String name, Double price, String type) {
        super(name, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
