package com.company.model;

import java.util.List;

public class Pereciveis extends Product{
    Integer daysPorCaducar;

    public Pereciveis(String name, Double price, Integer daysPorCaducar) {
        super(name, price);
        this.daysPorCaducar=daysPorCaducar;
    }

    @Override
    public Double calcule(Integer quantidadeOfProdutos) {
        double total = 0.0;

        try {
            switch (daysPorCaducar) {
                case 1:
                    total = (this.getPrice() / 4) * quantidadeOfProdutos;
                    break;
                case 2:
                    total = (this.getPrice() / 3) * quantidadeOfProdutos;
                    break;
                case 3:
                    total = (this.getPrice() / 2) * quantidadeOfProdutos;
                    break;
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro no calculo:" + e);
        }

        return total;
    }

    public static void totalPereciveis(List<Pereciveis> pereciveis, Integer quantidade) {
        Double total = 0d;
        for (Pereciveis item : pereciveis) {
            total += item.calcule(quantidade);
        }
        System.out.printf("%.2f", total);
    }

    public Integer getDaysPorCaducar() {
        return daysPorCaducar;
    }

    public void setDaysPorCaducar(Integer daysPorCaducar) {
        this.daysPorCaducar = daysPorCaducar;
    }

    public String toString() {
        return "Pessoa{" +
                "Nome='" + daysPorCaducar + '\'' +
                '}';
    }

}
