package com.java.sga.model;

public abstract class Pessoa{
    private String nome;
    private String matricula;
    private int idade;

    //Construtores
    protected Pessoa(String nome, String matricula, int idade) {
    this.nome = nome;
    this.matricula = matricula;
    this.idade = idade;
}

    protected Pessoa() {
    this.nome = "Antonio";
    this.idade = 16;
    this.matricula = "123456789";
}
    //Getters e Setters

    public String getNome() {
    return nome;
}

    public int getIdade() {
    return idade;
}

    public String getMatricula() {
    return matricula;
}

    public void setNome(String nome) {
    this.nome = nome;
}

    public void setIdade(int idade) {
    this.idade = idade;
}

    public void setMatricula(String matricula) {
    this.matricula = matricula;
}
}
