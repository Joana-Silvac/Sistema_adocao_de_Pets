package domain;

public class CPF {
    private String numero;
    public CPF(String numero){
        if (numero == null || numero.length() != 11){
            throw new IllegalArgumentException("CPF não correspondente");}
        this.numero = numero;}
    public String getNumero(){
        return numero;}}