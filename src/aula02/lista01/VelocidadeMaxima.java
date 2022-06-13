package aula02.lista01;

import java.util.Scanner;

public class VelocidadeMaxima {
    public void calcMulta(){
        int multa = 0;
        Scanner read = new Scanner(System.in);

        System.out.print("Informe a Velocidade Maxima da Via:[Km/h] ");
        double vMax = read.nextDouble();

        System.out.print("Informe a Velocidade do motorista:[Km/h] ");
        double vMot = read.nextDouble();

        if (vMot - vMax >= 31){
            multa = 200;
        } else if (vMot - vMax >= 11) {
            multa = 100;
        } else{
            multa = 50;
        }

        System.out.println("Multa foi de R$" + multa + ",00");
    }
}
