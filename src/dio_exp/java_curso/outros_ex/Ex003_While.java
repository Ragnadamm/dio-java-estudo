package dio_exp.java_curso.outros_ex;

import java.util.concurrent.ThreadLocalRandom;

public class Ex003_While {
    public static void main(String[] args) {

        double mesada = 50.0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio(); // chamando um método

            if (valorDoce > mesada) // o código iria rodar sem o"if", mas o valor terminaria
                valorDoce = mesada; // negativo, então ele está sendo usado para maior precisão

            System.out.println("Doce do valor: " + valorDoce + "Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda sua mesda em doces.");

        /*
         * Não se preocupe com os valores
         * Iremos explorar os recursos de formatção em breve!!
         */

    }

    //método que foi chamado
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}