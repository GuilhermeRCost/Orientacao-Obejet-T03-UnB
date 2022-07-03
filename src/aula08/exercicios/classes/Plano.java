package aula08.exercicios.classes;

public class Plano {

    private String nome;
    private double valor;
    private String caracteristicas;

    /*
     * Escrever codigo para criar um novo
     * plano. Esse metodo seria melhor
     * modelado como um construtor
     */

    public void adicionar(Pessoa cliente, double valor, String caracteristicas) {
        this.nome = cliente.nome;
        this.valor = valor;
        this.caracteristicas = caracteristicas;
    }

    /*
     * Escrever editar um plano. Talvez
     * seja necessario criar varios metodos
     * editar, um para cada campo que se
     * deseja editar ou a logica de escolha
     * do campo a ser editado deve estar
     * no codigo
     */
    public boolean editar(double valor) {
        this.valor = valor;
        return true;
    }
    public boolean editar(String caracteristicas){
        this.caracteristicas = caracteristicas;
        return true;
    }

    /*
     * Escrever deletar um plano.
     * Um plano so pode ser deletado
     * se nao estiver selecionado
     * por nenhum cliente.
     */
    public boolean deletar() {
        //todo
        return false;
    }

    public String imprimir_informacoes_basicas() {
        String saida = "Nome: ";
        saida = saida + nome + "\n";
        saida = saida + "Descricao: ";
        saida = saida + caracteristicas + "\n";
        return saida;
    }
}
