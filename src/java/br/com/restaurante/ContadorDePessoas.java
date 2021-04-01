package br.com.restaurante;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean (name="contador")
@SessionScoped

public class ContadorDePessoas {
    
private int limitePessoas, qtdePresentes, qtdeTotal, auxEntrada, auxSaida, auxTotal;
private String mensagemLimite = ""; 
private String mensagemEntrada = "";
private String mensagemSaida = "";

    public int getLimitePessoas() {
        return limitePessoas;
    }

    public int getQtdePresentes() {
        return qtdePresentes;
    }

    public int getQtdeTotal() {
        return qtdeTotal;
    }

    public int getAuxTotal() {
        return auxTotal;
    }

    public int getAuxEntrada() {
        return auxEntrada;
    }
    
    public int getAuxSaida() {
        return auxSaida;
    }

    public String getMensagemEntrada() {
        return mensagemEntrada;
    }

    public String getMensagemSaida() {
        return mensagemSaida;
    }

    public String getMensagemLimite() {
        return mensagemLimite;
    }
    
    public void setLimitePessoas(int limitePessoas) {
        this.limitePessoas = limitePessoas;
    }

    public void setQtdePresentes(int qtdePresentes) {
        this.qtdePresentes = qtdePresentes;
    }

    public void setQtdeTotal(int qtdeTotal) {
        this.qtdeTotal = qtdeTotal;
    }

    public void setAuxTotal(int auxTotal) {
        this.auxTotal = auxTotal;
    }

    public void setAuxSaida(int auxSaida) {
        this.auxSaida = auxSaida;
    }

    public void setAuxEntrada(int auxEntrada) {
        this.auxEntrada = auxEntrada;
    }

    public void setMensagemEntrada(String mensagemEntrada) {
        this.mensagemEntrada = mensagemEntrada;
    }

    public void setMensagemSaida(String mensagemSaida) {
        this.mensagemSaida = mensagemSaida;
    }

    public void setMensagemLimite(String mensagemLimite) {
        this.mensagemLimite = mensagemLimite;
    }

    //Função para definir o LIMITE DE PESSOAS
    public void ContadorDePessoas(int limite) {
        
        int aux = limite;
        
        if(aux >= 0){
            this.limitePessoas = limite;
            mensagemLimite = "Registro PERMITIDO !!!";
        }else{
            mensagemLimite = "Registro NEGADO !!!";
        }
    }
    
    //Função para registrar a ENTRADA
    public void registraEntrada(int quantidadeEntrada){
        
        int aux2 = qtdePresentes + quantidadeEntrada;
        
        if(aux2 <= limitePessoas){
            qtdePresentes += quantidadeEntrada; 
            auxTotal += quantidadeEntrada;
            mensagemEntrada = "Registro PERMITIDO !!!";
        }else{
            mensagemEntrada = "Registro NEGADO !!!";
        }
    }
    
    //Função para registrar a SAÍDA
    public void registraSaida(int quantidadeSaida){
        
        int aux3 = qtdePresentes - quantidadeSaida;
        
        if(aux3 >= 0){
            qtdePresentes -= quantidadeSaida;  
            mensagemSaida = "Registro PERMITIDO !!!";
        }else{
            mensagemSaida = "Registro NEGADO !!!";
        }
    }
    
    //Função para mostrar a QUANTIDADE TOTAL
    public int mostrarRelatorio(){
        
        qtdeTotal = auxTotal;
        
        return qtdeTotal;
    }
    
    // Função para zerar todas as variáveis (INT e STRING)
    public void limpar(){
        limitePessoas = 0;
        qtdePresentes = 0;
        qtdeTotal = 0;
        auxTotal = 0;
        auxEntrada = 0;
        auxSaida = 0;
        mensagemLimite = "";
        mensagemEntrada = "";
        mensagemSaida = "";
    }
}
