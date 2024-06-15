package br.com.infnet.singleton;

public class Empresa {
    private static Empresa instancia;
    private String nome;

    private Empresa(String nome){
        this.nome = nome;
    }

    public static Empresa getInstance(String nome){
        if(instancia == null) {
            instancia = new Empresa(nome);
        }
        return instancia;
    }

    public String getNome(){
        return nome;
    }
}
