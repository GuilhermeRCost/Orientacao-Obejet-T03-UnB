package aula02.lista01;

import java.util.Scanner;

public class NumeroPrimo {
    public boolean verificar(){
        Scanner read = new Scanner(System.in);
        System.out.print("Informe um número inteiro positivo: ");
        int j = read.nextInt();
        for (int i = 2; i < j; i++) {
            if ( j%i == 0){
                return false;
            }
        }
        return j > 1;
    }
}
