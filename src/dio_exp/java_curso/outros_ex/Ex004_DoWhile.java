package dio_exp.java_curso.outros_ex;

import java.util.Random;

public class Ex004_DoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do{
            //excutando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");

        }while(tocando());

        System.out.println("Alô!!!");
    }

    //método
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1; //valor aleatório entre 1 e 3, for igual a 1 ele atendeu
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando(o telefone parou de tocar)
        return ! atendeu;
        //exclamação "!" nega uma expressão booleana
    }
}
