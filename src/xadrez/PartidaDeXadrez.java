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
    private void alocarNovaPeca (char coluna, int linha, PecaDeXadrez peca ){
        tabuleiro.porPeca(peca, new XadrezPosicao(coluna, linha).paraPosicao());
    }

    private void configuracaoInicial (){
        alocarNovaPeca('b',6, new Torre(tabuleiro, Cor.BRANCA));
        alocarNovaPeca('e', 8, new Rei(tabuleiro, Cor.PRETA));
        alocarNovaPeca('e',1, new Rei(tabuleiro, Cor.BRANCA));
    }
}
