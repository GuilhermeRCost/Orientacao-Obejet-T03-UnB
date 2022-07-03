package aula08.exercicios.classes;

public class Ficha_de_Cadastro {

        private Pessoa cliente;
        private Plano plano_escolhido;

        public Ficha_de_Cadastro(Pessoa cliente,
                                 Plano plano_escolhido) {
            this.cliente = cliente;
            this.plano_escolhido = plano_escolhido;

        }

        public void trocar_plano(Plano novo) {
            plano_escolhido = novo;
            this.cliente.setPlano_cadastrado(novo);

        }

        public String imprimir() {
            String saida = "--- INFORMACOES DO CLIENTE ---\n";
            saida = saida + "Nome do cliente: ";
            saida = saida + cliente.imprimir_informacoes_basicas();
            saida = saida + "--- INFORMACOES DO PLANO ---\n";
            saida = saida + plano_escolhido.imprimir_informacoes_basicas();
            return saida;
        }


}
