package br.com.dobackaofront.model;

public class Guerreiro extends Personagem {
    private boolean duasEspadas;

    public Guerreiro() {

    }

    public Guerreiro(String nome, char sexo, int idade, int vitalidade, boolean duasEspadas) {
        super(nome,sexo,idade,vitalidade);
        this.duasEspadas = duasEspadas;
    }

    @Override
    public String toString() {
        return super.toString()+" duasEspadas: "+duasEspadas;
    }

    @Override
    public void atacar() {
        System.out.println("AHHHHHHHHHHHHHHH");
    }

    @Override
    public void defender() {
        System.out.println("Hahahahaha");
    }

    public String toString(int opcao) {
        if (opcao == 1)
            return super.toString()+" duasEspadas: "+duasEspadas;
        else
            return "DuasEspadas: "+duasEspadas;
    }
}
