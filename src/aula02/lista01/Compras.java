package aula02.lista01;

import java.util.Scanner;

public class Compras {
    public void comprar(){
        Scanner read = new Scanner(System.in);
        double desc;

        //Dados do produto
        System.out.print("Informe o nome do produto: ");
        String nome = read.nextLine();
        System.out.print("Informe a quantidade comprada: ");
        int quant = read.nextInt();
        System.out.print("Informe o preço unitario: R$");
        double precUni = read.nextDouble();

        if (quant <= 5){
            desc = 0.02;
        } else if (quant <=10) {
            desc =0.03;
        } else{
            desc = 0.05;
        }
        System.out.println("Nome: " + nome +"\nTotal = R$"+ precUni*quant + "\nDesconto = " + desc*100 + "% \nPreçoFinal = R$" + precUni*quant*(1-desc));
    }
}
