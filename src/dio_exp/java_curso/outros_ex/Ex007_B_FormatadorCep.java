package dio_exp.java_curso.outros_ex;

public class Ex007_B_FormatadorCep {
    public static void main(String[] args) {

        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (Ex007_A_CepInvalidoException e) {
            //tratando a exceção
            //e.printStackTrace();  //comentar linha para isso
            System.out.println("O cep não corresponde com a regras de negócio");
        }

    }
static String formatarCep(String cep) throws Ex007_A_CepInvalidoException {
    if(cep.length() != 8)
    throw new Ex007_A_CepInvalidoException();

    //simulando um cep formatado
    return "23.765-064";
}

}
