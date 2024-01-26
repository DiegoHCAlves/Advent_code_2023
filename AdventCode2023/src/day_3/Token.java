package day_3;

import java.util.ArrayList;
import java.util.List;

public class Token {
    private Character token;
    private Integer posicao;
    private Integer linha;
    private List<Integer> rangePosicao;
    private List<Integer> rangeLinha;

    public Token(Character token, Integer posicao, Integer linha){
        this.token = token;
        this.linha = linha;
        this.posicao = posicao;

        rangePosicao = new ArrayList<>();

        if (posicao > 1 && posicao < 140) {
            for (int i = posicao - 1; i <= posicao + 1; i++) {
                rangePosicao.add(i);
            }
        } else if (posicao == 1) {
            for (int i = posicao; i <= posicao + 1; i++) {
                rangePosicao.add(i);
            }
        } else if (posicao == 140) {
            for (int i = posicao - 1; i <= posicao; i++) {
                rangePosicao.add(i);
            }
        }

        rangeLinha = new ArrayList<>();

        if (linha > 1 && linha < 140) {
            for (int i = linha - 1; i <= linha + 1; i++) {
                rangeLinha.add(i);
            }
        } else if (linha == 1) {
            for (int i = linha; i <= linha + 1; i++) {
                rangeLinha.add(i);
            }
        } else if (linha == 140) {
            for (int i = linha - 1; i <= linha; i++) {
                rangeLinha.add(i);
            }
        }
    }


}
