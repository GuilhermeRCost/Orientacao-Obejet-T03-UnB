package aula02.lista01;

import java.util.Scanner;

public class Caracter {
    public void analyse(){
        Scanner read = new Scanner(System.in);

        System.out.print("Informe um caracter: ");
        char caracter = read.next().charAt(0);
        caracter = Character.toUpperCase(caracter);

        if (Character.isDigit(caracter)){
            System.out.printf("O caracter %c é um Algarismo\n", caracter);
        } else if ( !( Character.isAlphabetic(caracter) ) ) {
            System.out.printf("O caracter %c é um caracter especial\n", caracter);
        } else if (caracter == 'A' || caracter == 'E' || caracter == 'I' ||caracter == 'O' || caracter == 'U') {
            System.out.printf("O caracter %c é uma vogal\n", caracter);
        } else {
            System.out.printf("O caracter %c é uma consoante\n", caracter);
        }
    }
}
