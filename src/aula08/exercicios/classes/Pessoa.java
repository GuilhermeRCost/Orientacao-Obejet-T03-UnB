package aula08.exercicios.classes;

public class Pessoa {
    protected String nome;
    protected long cpf;
    protected String rg;
    protected String tel_contato;
    protected String end_residencial;

    private Plano plano_cadastrado;

    /*
     * Escrever codigo para criar uma
     * nova pessoa. Esse metodo seria
     * melhor modelado como um construtor
     */
    public boolean adicionar(String nome, long cpf, String rg, String tel_contato, String end_residencial) {
        if (this.nome == null){
            this.nome = nome;
            this.cpf = cpf;
            this.rg = rg;
            this.tel_contato = tel_contato;
            this.end_residencial =end_residencial;
            return true;
        }else
            return false;
    }


    /*
     * Escrever editar as informacoes de
     * uma pessoa. Talvez seja necessario
     * criar varios metodos editar, um
     * para cada campo que se deseja
     * editar ou a logica de escolha
     * do campo a ser editado deve estar
     * no codigo
     */
    public void editarTelefone(String tel_contato){
        this.tel_contato =tel_contato;
    }
    public void editarEndereco(String end_residencial){
        this.end_residencial = end_residencial;
    }

    /*
     * Escrever deletar uma pessoa.
     * Uma pessoa so pode ser deletada
     * se nao nao possuir um contrato
     */
    public boolean deletar() {
        if (this.plano_cadastrado == null){
            this.end_residencial = null;
            this.tel_contato = null;
            this.cpf = 0;
            this.nome = null;
            this.rg = null;
        }
        return false;
    }

    public String imprimir_informacoes_basicas() {
        String saida = "Nome: ";
        saida = saida + nome + "\n";
        saida = saida + "Telefone: ";
        saida = saida + tel_contato + "\n";
        saida = saida + "Endereco";
        saida = saida + end_residencial + "\n";
        return saida;
    }

    public void setPlano_cadastrado(Plano plano_cadastrado) {
        this.plano_cadastrado = plano_cadastrado;
    }
}
