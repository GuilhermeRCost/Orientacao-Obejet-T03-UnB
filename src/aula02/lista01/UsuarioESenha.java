package aula02.lista01;

import java.util.Scanner;

public class UsuarioESenha {

    public void acessar(){
        final int SENHA = 9999, USUARIO = 1234;

        Scanner read = new Scanner(System.in);
        System.out.print("Informe o Usuário [XXXX]: ");
        int novoU = read.nextInt();
        if (!(novoU == USUARIO)){
            System.out.println("Usuário Inválido");
        } else {
            System.out.print("Informe a Senha [XXXX]: ");
            int novaSenha = read.nextInt();

            if (novaSenha == SENHA){
                System.out.println("acesso permitido");
            }else {
                System.out.println("senha incorreta");
            }
        }
    }
}
