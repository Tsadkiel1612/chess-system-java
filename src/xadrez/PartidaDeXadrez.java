package xadrez;

import boardgame.Posicao;
import boardgame.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaDeXadrez {
    private Tabuleiro tabuleiro;

    public PartidaDeXadrez() {

        tabuleiro = new Tabuleiro(8,8);
        configuracaoInicial();
    }

    public PecaDeXadrez[][] getPecas(){
        PecaDeXadrez[][] mat = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for (int i = 0;i<tabuleiro.getLinhas();i++ ){
            for (int j = 0; j<tabuleiro.getColunas();j++){
                mat[i][j] = (PecaDeXadrez)tabuleiro.peca(i,j);
            }
        }
        return mat;
    }

    private void configuracaoInicial (){
        tabuleiro.porPeca(new Torre(tabuleiro, Cor.BRANCA), new Posicao(2,1));
        tabuleiro.porPeca(new Rei(tabuleiro, Cor.PRETA), new Posicao(0,4));
        tabuleiro.porPeca(new Rei(tabuleiro, Cor.BRANCA), new Posicao(7,4));
    }
}
