package dio_exp.java_curso.outros_ex;

public class Ex002_BreakContinue {
    public static void main(String[] args) {
        
        for(int numero = 1; numero <= 5; numero++) {
            if (numero == 3) 
                continue;  //break ou continue, muda o resultado

                //break para a aplicação ao atendar a condição
                //continue "pula"(o código não segue após) ao atender a condição, 
                //e segue com a aplicação
                System.out.println(numero);
            
        }
    }
}
