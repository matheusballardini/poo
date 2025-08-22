package com.java.sga.model;

public class Aluno extends Pessoa {
    private String listaNotas;
    private String turma;

    //Construtor
    public Aluno(String nome, String matricula, int idade, String listaNotas, String turma) {
        super(nome, matricula, idade); // chama o construtor da superclasse
        this.listaNotas = listaNotas;
        this.turma = turma;
    }

    
    
    //Getters e Setters
        public String getlistaNotas() {
            return listaNotas;
    }
    
        public String getTurma() {
            return turma;
    }
    
        public void setListaNomes(String listaNotas) {
            this.listaNotas = listaNotas ;
    }
    
        public void setTurma(String turma) {
            this.turma = turma;
    }
}