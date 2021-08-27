package com.company;

import com.company.model.NonPerishable;
import com.company.model.Pereciveis;
import com.company.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Distribuidor {

    public static void main(String[] args) {
        List<Pereciveis> pereciveis = new ArrayList<>();
        pereciveis.add(new Pereciveis("Mandioca", 5.0, 1));
        pereciveis.add(new Pereciveis("Ovo", 17.9, 2));
        pereciveis.add(new Pereciveis("Beterraba", 1.5, 3));
        pereciveis.add(new Pereciveis("Leite", 4.5, 2));
        pereciveis.add(new Pereciveis("Azeite", 20.0, 3));

        List<NonPerishable> naoPerecivel = new ArrayList<>();
        naoPerecivel.add(new NonPerishable("Pimenta", 8.0, "Tempero"));
        naoPerecivel.add(new NonPerishable("Oregano", 6.5, "Condimento"));
        naoPerecivel.add(new NonPerishable("Farinha de Trigo", 4.5, "Limpeza"));
        naoPerecivel.add(new NonPerishable("Café", 5.0, "Limpeza"));
        naoPerecivel.add(new NonPerishable("Macarrao", 4.0, "Massa"));

        NonPerishable.totalNonPerishable(naoPerecivel, 1);
        Pereciveis.totalPereciveis(pereciveis, 1);
    }
}
