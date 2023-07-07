package segundaSemana.execicioUm;

import java.util.Scanner;

public class ResultadoFatorial {
    public static void main(String args[]) {
        System.out.println("Digite um numero para saber seu fatorial:");
        int numero = new Scanner(System.in).nextInt();
        ResultadoFatorial.mostrarFatorial(numero);
    }

    public static void mostrarFatorial(int numero) {
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        System.out.println("O fatorial de " + numero + " é igual a " + resultado);
    }

}
