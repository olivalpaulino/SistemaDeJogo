package br.com.dobackaofront;

import br.com.dobackaofront.model.Cenario;
import br.com.dobackaofront.model.Elfo;
import br.com.dobackaofront.model.Guerreiro;
import br.com.dobackaofront.model.Mago;

public class Main {
    public static void main(String[] args) {
        // Instanciacao dos Personagens
        Guerreiro warrior1 = new Guerreiro();

        warrior1.setNome("Aragorn");
        warrior1.setIdade(30);
        warrior1.setSexo('M');
        warrior1.setVitalidade(100);

        Guerreiro warrior2 = new Guerreiro("Arator", 'M', 30, 100, true);
        System.out.println(warrior2.toString(1));

        Elfo legolas = new Elfo("Legolas",'M',150,300,2500);

        Mago gandalf = new Mago("Gandalf",'M',400,200,3000);

        // Cenario
        Cenario terraMedia = new Cenario("Terra Média");

        terraMedia.adicionar(warrior1);
        terraMedia.adicionar(warrior2);
        terraMedia.adicionar(legolas);
        terraMedia.adicionar(gandalf);

        gandalf.atacar();
        legolas.defender();
        warrior1.defender();
        warrior1.atacar();
        legolas.atacar();

        gandalf.defender(1,"Hahaha seus fracos");
        gandalf.virarSombrio();
    }
}