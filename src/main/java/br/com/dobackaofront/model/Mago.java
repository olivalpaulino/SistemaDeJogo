package br.com.dobackaofront.model;

public class Mago extends Personagem implements Contrato {
    private int mana; //

    public Mago() {

    }

    @Override
    public void atacar() {
        System.out.println("Pega o Cajado e Proclama as Palavras Mágicas");
    }

    @Override
    public void defender() {
        System.out.println("Pega o Cajado e se Agacha");
    }

    public void defender(int opcao) {
        if (opcao == 0) {
            System.out.println("Pega o Cajado e se Agacha");
        } else if (opcao == 1) {
            System.out.println("Levanta o Cajado e Proclama a Magia de Defesa");
        }
    }

    public void defender(int opcao, String frase) {
        if (opcao == 0) {
            System.out.println("Pega o Cajado e se Agacha. "+frase);
        } else if (opcao == 1) {
            System.out.println("Levanta o Cajado e Proclama a Magia de Defesa. "+frase);
        }
    }

    public Mago(int mana) {
        this.mana = mana;
    }

    public Mago(String nome, char sexo, int idade, int vitalidade, int mana) {
        super(nome, sexo, idade, vitalidade);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public void virarSombrio() {
        System.out.println("Virei um mago sombrio. Hahahah");
    }
}
