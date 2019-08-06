package lista_if_contains;

import java.util.Arrays;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<String> numeros = Arrays.asList("1","2","3");

        if (numeros.contains("2")){
            System.out.println("Existe 2!");
        }
    }
}
