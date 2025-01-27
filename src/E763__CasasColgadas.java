import java.util.Scanner;

public class E763__CasasColgadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadPalabras = sc.nextInt();

        for(int i = 1; i <= cantidadPalabras; i++) {
            String palabraActual = sc.next();

            if(palabraActual.length() == 8) System.out.println("Bien");
            else System.out.println("Mal");
        }
    }
}
