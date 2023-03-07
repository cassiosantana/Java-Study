package application;

import java.util.Arrays;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(3, 4, 5, 10 , 7);
        int soma = lista.stream().reduce(0, (x, y) -> x + y);
        System.out.println(soma);

        List<Integer> novaLista = lista.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10)
                .toList();
        System.out.println(Arrays.toString(novaLista.toArray()));
    }
}
