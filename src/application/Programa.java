package application;

import boardgame.Posicao;
import boardgame.Tabuleiro;
import xadrez.PartidaDeXadrez;

public class Programa {

    public static void main(String[] args) {
	// write your code here
        PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();
        InterfaceUsuario.imprimirTabuleiro(partidaDeXadrez.getPecas());



    }
}
