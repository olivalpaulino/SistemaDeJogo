package br.com.dobackaofront.model;

public abstract class Personagem {
    private String nome;
    private char sexo;
    private int idade;
    private int vitalidade;

    public Personagem() {}
    public Personagem(String nome, char sexo, int idade, int vitalidade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.vitalidade = vitalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitalidade() {
        return vitalidade;
    }

    public void setVitalidade(int vitalidade) {
        this.vitalidade = vitalidade;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", sexo=" + sexo +
                ", idade=" + idade +
                ", vitalidade=" + vitalidade +
                '}';
    }

    public abstract void atacar();

    public abstract void defender();
}
