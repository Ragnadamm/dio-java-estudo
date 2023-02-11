package dio_exp.java_curso.outros_ex;

import java.text.NumberFormat;
import java.text.ParseException;

public class Ex006_Excecao {
    public static void main(String[] args) {

        // conversão de uma string para um número

        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
