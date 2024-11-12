package br.com.dobackaofront.model;

import java.util.ArrayList;

public class Cenario {
    private String nome;
    private ArrayList<Personagem> personagens;

    public Cenario(String nome) {
        this.nome = nome;
        personagens = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Personagem> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(ArrayList<Personagem> personagens) {
        this.personagens = personagens;
    }

    public void adicionar(Personagem personagem) {
        personagens.add(personagem);
    }

    public void remover(Personagem personagem) {
        personagens.remove(personagem);
    }
}
