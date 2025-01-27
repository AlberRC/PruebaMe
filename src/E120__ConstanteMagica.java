import java.util.Scanner;
public class E120__ConstanteMagica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanio;
        while(true){
            tamanio = sc.nextInt();
            int primerNumero = sc.nextInt();
            int[][] matriz = new int[tamanio][tamanio];
            if(tamanio == 0 && primerNumero == 0) break;

            int fila = 0;
            int columna = tamanio / 2;
            for(int j = 0; j < tamanio * tamanio; j++){
                if(j != 0) {
                    if(matriz[fila][columna] != 0 || (fila == 0 && columna == tamanio / 2)){
                        fila = fila + 2;
                        columna--;
                        if (fila > tamanio - 1) fila -= tamanio;
                        if (columna < 0) columna += tamanio;
                    }
                }
                matriz[fila][columna] = primerNumero;
                fila--;
                columna++;
                primerNumero++;
                if(columna > tamanio - 1) {
                    columna = 0;
                }
                if(fila < 0) {
                    fila = tamanio - 1;
                }
            }
            int numeroMagico = 0;
            for(int z = 0; z < tamanio; z++) {
                numeroMagico = numeroMagico + matriz[0][z];
            }
            System.out.println(numeroMagico);
        }
    }
}
