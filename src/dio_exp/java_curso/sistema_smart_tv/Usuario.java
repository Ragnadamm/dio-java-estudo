package dio_exp.java_curso.sistema_smart_tv;

public class Usuario {

    /*Exercitando
    Vamos criar um exemplo de uma classe para representar uma SmartTV onde:
    Ela tenha as características: ligada (boolean), canal (int) e volume (int);
    Nossa TV poderá ligar e desligar e assim mudar o estado ligada;
    Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
    Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente.*/

    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        System.out.println("\nTV ligada? " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);


        System.out.println("\nCanal atual: " + smartTV.canal);
        smartTV.mudarCanal(13);
        System.out.println("Canal atual: " + smartTV.canal + "\n");


        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("\nVolume atual: " + smartTV.volume);


        smartTV.ligar();
        System.out.println("\nNovo Status -> TV ligada? " + smartTV.ligada);
        smartTV.desligar();
        System.out.println("Novo Status -> TV ligada? " + smartTV.ligada);

    }
}
