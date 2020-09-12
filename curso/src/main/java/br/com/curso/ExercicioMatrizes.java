import java.util.Scanner;

public class ExercicioMatrizes {
    public static void main(String[] args) {

        String usuario;             // Variável que receberá o nome do 'admin' do sistema

        int alunos;                 // A quantidade de alunos será dada na entrada  'quantAlunos'
        int quantidadeNotas = 4;    // Esta pode ser considerada uma "regra de negócio" onde nesta escola é obrigatório que o aluno tenha 4 notas
        int notaMinimaAprovacao = 7; // Esta é a nota mínima para ser aprovado

        // Inicialização dos leitores de dados que serão passados na entrada
        Scanner nomeUsuario = new Scanner(System.in);
        Scanner quantAlunos = new Scanner(System.in);
        Scanner notas = new Scanner(System.in);

        System.out.println(">> EXERCÍCIO DE MATRIZES <<");            // Título da aula
        System.out.println("Como gostaria que te chamássemos? ");
        usuario = nomeUsuario.next();                            // Recebendo o nome do usuário
        System.out.println("Boas vindas, " +usuario+"!");       // Mensagem de boas vindas

        System.out.println("Informe a quantidade de alunos desejada: ");    //recebendo a quantidade de alunos
        alunos = quantAlunos.nextInt();    // Como a variável iniciou com zero, vou incrementar o valor que digitar

        double [][] notasAlunos = new double[alunos][quantidadeNotas];      // Matriz que abriga as notas e quantidade de alunos
        for(int x = 0; x < alunos; x++){        // Laçço que entra na matriz da qtd. de alunos
            System.out.println("Informe as notas do Aluno " + (x+1) + ": ");
            double soma = 0;
            for(int y = 0; y < quantidadeNotas; y++){       // Laço que entra na matriz da quantidade de notas
                System.out.println("Nota " + (y+1) + ": ");
                notasAlunos[x][y] = notas.nextDouble();     // captura das notas
                soma += notasAlunos[x][y];
            }
            double media = soma / quantidadeNotas;      // cálculo da média
            String resultadoFinal = "";
            if(media >= notaMinimaAprovacao){             // Verificação se o aluno foi 'aprovado' ou 'reprovado'
                resultadoFinal = "Certô, miseravi!";
            }else {
                resultadoFinal = "não consegue, né?!";
            }
            System.out.println("A média do aluno " + (x+1) + " foi " + media + ". Portanto, " + resultadoFinal);       // Resultado impresso


        }



    }
}
