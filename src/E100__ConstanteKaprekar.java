import java.util.Arrays;
import java.util.Scanner;
public class E100__ConstanteKaprekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadNumeros = sc.nextInt();
        int[] numeros = new int[cantidadNumeros];

        for(int i = 0; i < cantidadNumeros; i++) {
            numeros[i] = sc.nextInt();
        }

        for(int i = 0; i < cantidadNumeros; i++) {
            int numeroActual = numeros[i];
            int cantidadVueltas = 0;

            while(numeroActual != 6174) {
                String numeroString = String.format("%04d", numeroActual);
                char[] digitos = numeroString.toCharArray();
                Arrays.sort(digitos);

                String numeroAscendenteStr = new String(digitos);
                String numeroDescendenteStr = new StringBuilder(numeroAscendenteStr).reverse().toString();

                int numeroAscendente = Integer.parseInt(numeroAscendenteStr);
                int numeroDescendente = Integer.parseInt(numeroDescendenteStr);

                if(numeroAscendente == numeroDescendente) {
                    cantidadVueltas = 8;
                    break;
                }

                numeroActual = numeroDescendente - numeroAscendente;
                cantidadVueltas++;
            }
            System.out.println(cantidadVueltas);
        }
    } //hola
}
