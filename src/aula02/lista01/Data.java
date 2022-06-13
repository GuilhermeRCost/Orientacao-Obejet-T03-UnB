package aula02.lista01;

import java.util.Scanner;

public class Data {
    public void maiorData(){
        //Programa parte do pressuposto que a data é vaida
        int dia1, mes1, ano1 , dia2, mes2, ano2;
        boolean maior1 = false, mesmadata = false;
        Scanner read = new Scanner(System.in);
        System.out.print("Informe a 1° data: [dd mm aaaa] ");
        dia1 = read.nextInt();
        mes1 = read.nextInt();
        ano1 = read.nextInt();

        System.out.print("Informe a 2° data: [dd mm aaaa] ");
        dia2 = read.nextInt();
        mes2 = read.nextInt();
        ano2 = read.nextInt();

        //Comparação das datas
        if (mes1 ==mes2 && ano1 ==ano2 && dia1==dia2){
            mesmadata = true;
        }else if (ano1 > ano2){
            maior1 = true;
        } else if (ano2 == ano1) {
            if (mes1 > mes2) {
                maior1 = true;
            } else if(mes1 == mes2){
                maior1 = dia1 > dia2;
            }
        }

        if (mesmadata){
            System.out.println("As datas informadas são iguais");
        }else if(maior1) {
            System.out.printf("%02d/%02d/%04d é maior que %02d/%02d/%04d", dia1,mes1,ano1, dia2,mes2,ano2);
        }else {
            System.out.printf("%02d/%02d/%04d é maior que %02d/%02d/%04d", dia2,mes2,ano2, dia1,mes1,ano1);
        }
    }

}
