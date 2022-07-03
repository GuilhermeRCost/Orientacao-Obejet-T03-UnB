package aula07.questionario;

import java.util.Locale;
import java.util.Scanner;
import aula07.questionario.Ticket;
public class Main {
    public static void main(String[] args) {
        //Você não precisa alterar esse método.

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        String data = entrada.next();
        String destino = entrada.next();
        String horario = entrada.next();
        String embarque = entrada.next();

        double valor = entrada.nextDouble();
        Ticket t = new Ticket(data, destino, horario, embarque, valor);
        System.out.println(t.validador());
        System.out.println(t.toString());

    }
}