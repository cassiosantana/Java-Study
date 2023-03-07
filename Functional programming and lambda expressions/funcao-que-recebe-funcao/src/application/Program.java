package application;

import entities.Produto;
import util.FiltradorDeProdutos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {

    public static void main(String[] args) {
        List<Produto> lista = new ArrayList<>();
        lista.add(new Produto("Tv", 900.00));
        lista.add(new Produto("Mouse", 50.00));
        lista.add(new Produto("Tablet", 350.50));
        lista.add(new Produto("HD Case", 80.90));

        double somaCaractereInicial_T = FiltradorDeProdutos.somaFiltrada(lista, product -> product.getNome().charAt(0) == 'T');
        double somaValorMaximo_100 = FiltradorDeProdutos.somaFiltrada(lista, product -> product.getPreco() <= 100.0);
        System.out.printf("Soma dos valores de produtos iniciatos por 'T' = %.2f%n", somaCaractereInicial_T);
        System.out.printf("Soma dos valores de produtos de até US$ 100.00 = %.2f%n", somaValorMaximo_100);
    }
}
