package controller;

import com.sun.source.doctree.SummaryTree;
import model.*;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    public static void main(String[] args) {
        //Explorando o polimorfismo por Sobrecarga
        Personagem a1 = new Aviao();
        Personagem a2 = new Aviao(5, 5);
        Personagem n1 = new Navio();
        Personagem n2 = new Navio(5, 5);
        Personagem t1 = new Tanque();
        Personagem t2 = new Tanque(5, 5);
        Personagem s1 = new Submarino();
        Personagem s2 = new Submarino(5, 5);

        //Explorando o polimorfismo Paramétrico
        List<Personagem> personagemList = new ArrayList<>();
        personagemList.add(a1);
        personagemList.add(a2);
        personagemList.add(n1);
        personagemList.add(n2);
        personagemList.add(t1);
        personagemList.add(t2);
        personagemList.add(s1);
        personagemList.add(s2);

        //Explorando o polimorfismo por Sobreescrita
        for(Personagem p : personagemList) {
            p.desenhar();
        }

        //Explorando o downcast
        for(Personagem p : personagemList) {
            p.mover(8,8);
            if(p instanceof Aviao){
                ((Aviao) p).mover3D(2,2,2);
            }

            System.out.println(p);
        }
    }
}
