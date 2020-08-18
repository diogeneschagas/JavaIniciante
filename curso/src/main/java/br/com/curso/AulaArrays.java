import java.util.Scanner;
public class AulaArrays {

    public static void main(String[] args) {

        int dia;

        Scanner scanner = new Scanner(System.in);
        System.out.println(">> AULA DE ARRAYS <<");

        // Criação do array (Lembrando: A contagem do Array começa em 0)
        
        // tipo do Array  em seguida  variável = Boa prática
        double[] temperatura = new double[7];  // Na linguagem Java, devemos passar a quantidade de posições do Array
        temperatura[0] = 32.9;
        temperatura[1] = 31.55;
        temperatura[2] = 36.21;
        temperatura[3] = 33.3;
        temperatura[4] = 32.12;
        temperatura[5]= 34.9;
        temperatura[6]= 38.3;


        System.out.println("Selecione um dia válido: ");
        dia = scanner.nextInt();
        while (dia > temperatura.length || dia <= 0){
            System.out.println("Dia inválido! Por favor, selecione um dia entre 1 e 7: ");
            dia = scanner.nextInt();
        }

        // aqui subtraí por um pq como o Array começa com posição zero (0), se eu quiser a temperatura do dia '1', teoricamente devo buscar pela posição 0
        System.out.println("O valor da temperatura do dia " + dia + " é: " + temperatura[dia-1]);



    }
}
