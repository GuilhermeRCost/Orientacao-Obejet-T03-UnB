package aula02.lista01;

import java.util.Scanner;

public class Baskara {
    public void raizes(){
        double delta, a, b, c;
        Scanner read = new Scanner(System.in);
        do {
          System.out.println("Informe dos valores da eq: a*x² + b*x + c");

            System.out.print("a = ");
            a = read.nextDouble();
            if (a==0){
                System.out.println("O valor de A nao pode ser nulo");
                //Limpando o console do java
                //Runtime.getRuntime().exec("cls");

            }
        }while (a == 0);
        System.out.print("b = ");
        b = read.nextDouble();
        System.out.print("c = ");
        c = read.nextDouble();

        delta = calcDelta(a, b, c);
        System.out.printf("Delta = %.02f\n", delta);

        raizes(delta, a, b ,c);

    }

    private double calcDelta(double a, double b, double c){
        return  (double) b*b - 4*a*c;
    }

    private void raizes(double delta, double a, double b, double c){
        double r1, r2;

        if (delta < 0){
            System.out.printf("A eq. %.02f*x² + %.02f*x + %.02f não possui raizes reais\n", a, b, c);
        } else if (delta ==0) {
            r1 = (double) (delta -b)/2*a;
            System.out.printf("A eq. %.02f*x² + %.02f*x + %.02f possui uma raiz real %.02f com multiplicidade 2\n", a, b, c, r1);
        }else {
            r1 = (double) (Math.sqrt(delta) -b)/2*a;
            r2 = (double) (-(Math.sqrt(delta)) - b)/2*a;

            System.out.printf("A eq. %.02f*x² + %.02f*x + %.02f possui duas raizes reais %.02f e %.02f\n", a, b, c, r1,r2);
        }
    }
}
