package util;

import entities.Produto;

import java.util.List;
import java.util.function.Predicate;

public class FiltradorDeProdutos {

    public static double somaFiltrada(List<Produto> lista, Predicate<Produto> criterio) {
        double soma = 0.0;
        for (Produto p : lista) {
            if (criterio.test(p)) {
                soma += p.getPreco();
            }
        }
        return soma;
    }

}
