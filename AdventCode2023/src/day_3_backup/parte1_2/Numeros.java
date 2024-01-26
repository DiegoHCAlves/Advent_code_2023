package day_3_backup.parte1_2;

import java.util.ArrayList;
import java.util.List;

public class Numeros {
    private String valor;
    private Integer posicaoInicial;
    private Integer posicaoFinal;
    private Integer linha;

    List<Numeros> numero = new ArrayList<>();

    int j = 1;
    String n = "";

    public Numeros(String valor, Integer posicaoInicial, Integer posicaoFinal, Integer linha) {
        this.valor = valor;
        this.posicaoInicial = posicaoInicial;
        this.posicaoFinal = posicaoFinal;
        this.linha = linha;
    }

    public Numeros() {

    }

    public String getNumero() {
        return valor;
    }

    public void setNumero(String numero) {
        this.valor = numero;
    }

    public Integer getPosicaoInicial() {
        return posicaoInicial;
    }

    public void setPosicaoInicial(Integer posicaoInicial) {
        this.posicaoInicial = posicaoInicial;
    }

    public Integer getPosicaoFinal() {
        return posicaoFinal;
    }

    public void setPosicaoFinal(Integer posicaoFinal) {
        this.posicaoFinal = posicaoFinal;
    }

    public Integer getLinha() {
        return linha;
    }

    public void setLinha(Integer linha) {
        this.linha = linha;
    }

    public List<Numeros> getNumeros() {
        return numero;
    }

    public void setNumeros(List<Numeros> numeros) {
        this.numero = numeros;
    }

    public void mapearNumeros(List<String> linhasArquivo) {
        for (String l : linhasArquivo) {
            for (int i = 0; i < l.length()-1; i++) {
                if (i == 0 && Character.isDigit(l.charAt(i))) {
                    posicaoInicial = i;
                    n += "" + l.charAt(i);
                } else if (Character.isDigit(l.charAt(i)) && !Character.isDigit(l.charAt(i - 1))) {
                    posicaoInicial = i;
                    n += "" + l.charAt(i);
                } else if (Character.isDigit(l.charAt(i)) && !Character.isDigit(l.charAt(i + 1))) {
                    n += "" + l.charAt(i);
                    posicaoFinal = i;
                    Numeros num = new Numeros(n,posicaoInicial,posicaoFinal,j);
                    numero.add(num);
                    n = "";
                } else if (Character.isDigit(l.charAt(i))) {
                    n += "" + l.charAt(i);
                }
            }
            n = "";
            j++;
        }
    }

    public void mostrarNumeros(List<Numeros> numeros) {
        for (Numeros n : numero) {
            System.out.println("Linha: " + n.linha);
            System.out.println("Numero: " + n.valor);
            System.out.println("Posição inicial: " + n.posicaoInicial);
            System.out.println("Posição final: " + n.posicaoFinal);
            System.out.println();
            break;
        }
    }


}
