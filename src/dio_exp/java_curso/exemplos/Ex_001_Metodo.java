package dio_exp.java_curso.exemplos;

public class Ex_001_Metodo {

    public static void main(String[] args) {

        String primeiroNome = "Felipe";
        String segundoNome = "Pontes";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        //chamando um método

        System.out.println(nomeCompleto);
    }

    //criando outro método
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);

        //duas formas de concatenação
    }

}
