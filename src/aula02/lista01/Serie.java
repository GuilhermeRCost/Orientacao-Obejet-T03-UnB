package aula02.lista01;

public class Serie {
    public double calcSoma(){
        double soma = 0;

        for (int i = 1; i <= 50; i++) {
            soma = soma + (double) ((2*i) -1)/i;
        }

        return soma;
    }
}
