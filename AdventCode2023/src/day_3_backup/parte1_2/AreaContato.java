package day_3_backup.parte1_2;

import java.util.ArrayList;
import java.util.List;

public class AreaContato extends Token {

    private Integer linhaAcima;
    private Integer linhaAbaixo;
    private Integer linha;
    private Integer colunaInicial;
    private Integer colunaFinal;
    private Integer posicao;
    private List<List<List<Integer>>> listaDeAreas = new ArrayList<>();

    Integer i=0;

    public AreaContato() {

    }

    public void addArea(Character token,Integer linha, Integer posicao) {
        List<Integer> range = new ArrayList<>();

        if (posicao > 1 && posicao < 140) {
            for (i = posicao - 1; i <= posicao + 1; i++) {
                range.add(i);
            }
        } else if (posicao == 1) {
            for (i = posicao; i <= posicao + 1; i++) {
                range.add(i);
            }
        } else if (posicao == 140) {
            for (i = posicao - 1; i <= posicao; i++) {
                range.add(i);
            }
        }

        List<List<Integer>> listaDeRanges = new ArrayList<>();
        listaDeRanges.add(range);
        listaDeAreas.add(listaDeRanges);

    }


    public Integer getLinhaAcima() {
        return linhaAcima;
    }

    public void setLinhaAcima(Integer linhaAcima) {
        this.linhaAcima = linhaAcima;
    }

    public Integer getLinhaAbaixo() {
        return linhaAbaixo;
    }

    public void setLinhaAbaixo(Integer linhaAbaixo) {
        this.linhaAbaixo = linhaAbaixo;
    }

    @Override
    public Integer getLinha() {
        return linha;
    }

    @Override
    public void setLinha(Integer linha) {
        this.linha = linha;
    }

    public Integer getColunaInicial() {
        return colunaInicial;
    }

    public void setColunaInicial(Integer colunaInicial) {
        this.colunaInicial = colunaInicial;
    }

    public Integer getColunaFinal() {
        return colunaFinal;
    }

    public void setColunaFinal(Integer colunaFinal) {
        this.colunaFinal = colunaFinal;
    }

    @Override
    public Integer getPosicao() {
        return posicao;
    }

    @Override
    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }

    public List<List<List<Integer>>> getListaDeAreas() {
        return listaDeAreas;
    }

    public void setListaDeAreas(List<List<List<Integer>>> listaDeAreas) {
        this.listaDeAreas = listaDeAreas;
    }

    public void mostrarAreaContato(List<List<List<Integer>>> listaDeAreas) {
        for(List<List<Integer>> l : listaDeAreas){
            for(List<Integer> r : l){
                for(Integer i : r){
                    System.out.print(" " +i);
                }
                System.out.println();
            }
        }

    }


}