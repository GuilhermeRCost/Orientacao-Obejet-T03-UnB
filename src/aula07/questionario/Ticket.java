package aula07.questionario;
import java.util.Scanner;
public class Ticket {
    private String data;
    private String destino;
    private String hora_embarque;
    private String local_embarque;
    private double valor;
    // status = true significa que o ticket já foi usado e é, portanto, invalido
    private boolean status;

    public Ticket(String data, String destino, String hora_embarque,
                  String local_embarque, double valor){
        //Instanciando o objeto
        this.data = data;
        this.destino = destino;
        this.hora_embarque = hora_embarque;
        this.local_embarque = local_embarque;
        this.valor = valor;
        this.setStatus(false);
    }

    public String validador(){
        // coloque aqui o código do método que valida um ticket
        if (this.status){
            return "Ticket invalido";
        }else {
            return "Ticket valido";
        }

    }

    public void invalidar() {
        // coloque aqui o código do método que invalida um ticket
        this.setStatus(true);
    }


    public String toString() {
        // coloque aqui o código do método toString
        return String.format("Data = %s\nDestino = %s\nHorario = %s\nLocal de embarque = %s\nValor = R$ %.02f\n%s",
                                this.getData(), this.getDestino(), this.getHora_embarque(), this.getLocal_embarque(), this.getValor(),this.validador());

    }

    //Getters & Setters
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHora_embarque() {
        return hora_embarque;
    }

    public void setHora_embarque(String hora_embarque) {
        this.hora_embarque = hora_embarque;
    }

    public String getLocal_embarque() {
        return local_embarque;
    }

    public void setLocal_embarque(String local_embarque) {
        this.local_embarque = local_embarque;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isStatus() {
        return status;
    }

    private void setStatus(boolean status) {
        this.status = status;
    }
}

