package dio_exp.java_curso.outros_ex;

public class Ex001_ForArray {
    public static void main(String[] args) {
        
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        //em arrays o indice inicia em ZERO
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("\nO aluno no indice x: " + x + " é " + alunos[x]);
        }
        // length significa tamanho

        //For Each, forma resumida/abreviada, para se trabalhar array ou coleção
        for (String aluno : alunos) {
            System.out.println("\nO nome do aluno é: " + aluno);
        }
        
    }
}
