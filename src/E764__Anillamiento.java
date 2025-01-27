import java.util.Scanner;

public class E764__Anillamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int campaniaActual = sc.nextInt();
        int avesAnilladasCampania = 0;

        while (campaniaActual != 0) {
            for(int i = 1; i <= campaniaActual; i++) {
                int avesCapturadas = sc.nextInt();
                int avesConAnillos = sc.nextInt();
                avesAnilladasCampania = avesAnilladasCampania + avesCapturadas - avesConAnillos;
            }
            System.out.println(avesAnilladasCampania);
            avesAnilladasCampania = 0;
            campaniaActual = sc.nextInt();
        }
    }
}
