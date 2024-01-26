package day_3_backup.parte1_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Token {
    List<Token> tokens = new ArrayList<>();
    private Character token;
    private Integer posicao;
    private Integer linha;
    int j = 0;
    private AreaContato areaContato;

    public Token(Character token, Integer posicao, Integer linha) {
        this.token = token;
        this.posicao = posicao;
        this.linha = linha;
    }

    public List<Token> getTokens() {
        return tokens;
    }

    public void setTokens(List<Token> tokens) {
        this.tokens = tokens;
    }

    public Token() {

    }

    public List<Character> getToken() {
        return Collections.singletonList(token);
    }

    public void setToken(Character token) {
        this.token = token;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }

    public List<Token> getLinhas() {
        return tokens;
    }

    public void setLinhas(List<Token> tokens) {
        this.tokens = tokens;
    }

    public Integer getLinha() {
        return linha;
    }

    public void setLinha(Integer linha) {
        this.linha = linha;
    }

    public AreaContato getAreaContato() {
        return areaContato;
    }

    public void setAreaContato(AreaContato areaContato) {
        this.areaContato = areaContato;
    }

    public void mapearToken(List<String> linhasArquivo, AreaContato areaContato) {
        for (String l : linhasArquivo) {
            j++;
            for (int i = 0; i < l.length(); i++) {
                if (l.charAt(i) == '.') {
                } else if (Character.isDigit(l.charAt(i))) {
                } else {
                    Token token = new Token(l.charAt(i), i, j);
                    tokens.add(token);
                    areaContato.addArea(l.charAt(i),j,i);
                }
            }
        }
    }

    public void mostrarTokens(List<Token> token) {
        for (Token t : token) {
            System.out.println("Linha: " + t.getLinha());
            System.out.println("Token: " + t.getToken());
            System.out.println("Posicao: " + t.getPosicao());
            System.out.println();
            break;
        }
    }





}
