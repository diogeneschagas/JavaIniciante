import java.util.Random;

public class AulaForEach {
    public static void main(String[] args) {
        int [] notas = new int[10];

        Random random = new Random();

        System.out.println(">> UTILIZANDO FOR PARA 'VARRER' UM ARRAY 1 <<");
        for (int i=0; i < notas.length; i++){
            notas[i] = random.nextInt(10);
            System.out.println(notas[i]);
        }

/*
        System.out.println(">> UTILIZANDO FOR PARA 'VARRER' UM ARRAY 2 <<");
        for (int i=0; i < notas.length; i++){
            int nota = notas[i];
            random.nextInt(10);
            System.out.println(nota);
        }
*/

        System.out.println(">> UTILIZANDO FOR EACH PARA 'VARRER' UM ARRAY <<");
        for (int nota:notas){
            System.out.println(nota);
        }

    }
}
