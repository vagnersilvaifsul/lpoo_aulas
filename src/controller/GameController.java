package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    public static void main(String[] args) {

        //Polimorfismo por sobrecarga
        Aviao a1 = new Aviao();
        Aviao a2 = new Aviao(2.0, 2.0);

        Navio n1 = new Navio();
        Navio n2 = new Navio(3.0, 3.0);

        Tanque t1 = new Tanque();
        Tanque t2 = new Tanque(4.0,4.0);

        Submarino s1 = new Submarino();
        Submarino s2 = new Submarino(5.0,5.0);

        //Polimorfismo Paramétrico
        List<Personagem> personagems = new ArrayList<>();
        personagems.add(a1);
        personagems.add(a2);
        personagems.add(n1);
        personagems.add(n2);
        personagems.add(t1);
        personagems.add(t2);
        personagems.add(s1);
        personagems.add(s2);

        for (Personagem personagem : personagems) {
            //Polimorfismo por sobreescrita
            personagem.desenhar();
            System.out.println(personagem.toString());
        }

        System.out.println("---- Movendo os personagens -----");
        for (Personagem personagem : personagems) {
            if(personagem instanceof Aviao){
                //uso do Downcasting
                ((Aviao) personagem).mover(4.0, 4.0, 4.0);
            } else if(personagem instanceof Navio){
                personagem.mover(6.0, 6.0);
            } else if(personagem instanceof Tanque){
                personagem.mover(8.0, 8.0);
            } else if(personagem instanceof Submarino){
                personagem.mover(10.0, 10.0);
            }

            System.out.println(personagem.toString());
        }

    }
}
