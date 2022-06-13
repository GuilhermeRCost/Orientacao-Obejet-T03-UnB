package aula02.lista01;

import java.util.Scanner;

public class Numero {
    public String escrever(){
        Scanner read = new Scanner(System.in);
        System.out.print("Informe um numero de 1 a 10: ");
        int num = read.nextInt();

        return switch (num) {
            case 1 -> "um";
            case 2 -> "dois";
            case 3 -> "tres";
            case 4 -> "quatro";
            case 5 -> "cinco";
            case 6 -> "seis";
            case 7 -> "sete";
            case 8 -> "oito";
            case 9 -> "nove";
            case 10 -> "dez";
            default -> "Não foi possível mostrar seu extenso";
        };
    }
}
