package com.java.sga.model;

public class Professor extends Pessoa {
    private String disciplina;
    private String listaTurmas;

    //Construtores
    public Professor(String nome, String matricula, int idade, String disciplina, String listaTurmas) {
        super(nome, matricula, idade); // chama o construtor da superclasse
        this.disciplina = disciplina;
        this.listaTurmas = listaTurmas;
    }
    //Getters e Setters
    
    public String getDisciplina() {
        return disciplina;
}

    public String getListaTurmas() {
        return listaTurmas;
}

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina ;
}

    public void setListaTurmas(String listaTurmas) {
        this.listaTurmas = listaTurmas;
}

}

