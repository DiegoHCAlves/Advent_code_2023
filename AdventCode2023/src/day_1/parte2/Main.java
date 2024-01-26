package day_1.parte2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {
    public static String reverseString(String s) {
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            res += s.charAt(i);
        }
        return res;
    }
    public static void main(String[] args) throws IOException {
        Path Arquivo = Paths.get("C://Users//c3714035//IdeaProjects//AdventCode2023//src//day_1//Arquivo");

        Map<String, String> conversao = new HashMap<>();
        conversao.put("one", "one1");
        conversao.put("two", "two2");
        conversao.put("three", "three3");
        conversao.put("four", "four4");
        conversao.put("five", "five5");
        conversao.put("six", "six6");
        conversao.put("seven", "seven7");
        conversao.put("eight", "eight8");
        conversao.put("nine", "nine9");

        Map<String, String> mapInvertido = new HashMap<>();
        mapInvertido.put("eno", "eno1");
        mapInvertido.put("owt", "owt2");
        mapInvertido.put("eerht", "eerht3");
        mapInvertido.put("ruof", "ruof4");
        mapInvertido.put("evif", "evif5");
        mapInvertido.put("xis", "xis6");
        mapInvertido.put("neves", "neves7");
        mapInvertido.put("thgie", "thgie8");
        mapInvertido.put("enin", "enin9");

        List<String> linhasArquivo = Files.readAllLines(Arquivo);
        int somaFinal = 0;
        String s;
        int SomaPrimeiro = 0, SomaSegundo = 0;

        int i = 1;
        String linhaUm = null, linhaDois = null;
        Character primeiro = null, ultimo = null;

        for (String linha : linhasArquivo) {
            linhaUm = linha;
            for (String chave : conversao.keySet()) {
                linhaUm = linhaUm.replace(chave, String.valueOf(conversao.get(chave)));
            }
            Loop:
            for (int j = 0; j < linhaUm.length(); j++) {
                if (linhaUm.isEmpty()) {
                    break Loop;
                } else if (Character.isDigit(linhaUm.charAt(j))) {
                    primeiro = linhaUm.charAt(j);
                    s = "" + primeiro + "0";
                    int valor = parseInt(s);
                    SomaPrimeiro += valor;
                    break Loop;
                }
            }
        }

        for (String linha : linhasArquivo) {
            linhaDois = linha;
            linhaDois = reverseString(linhaDois);
            for (String chave : mapInvertido.keySet()) {
                linhaDois = linhaDois.replace(chave, String.valueOf(mapInvertido.get(chave)));
            }
            Loop:
            for (int j = 0; j < linhaDois.length(); j++) {
                if (linhaDois.isEmpty()) {
                    break Loop;
                } else if (Character.isDigit(linhaDois.charAt(j))) {
                    ultimo = linhaDois.charAt(j);
                    s = "" + ultimo;
                    int valor = parseInt(s);
                    SomaSegundo += valor;
                    break Loop;
                }
            }
        }
        somaFinal = SomaPrimeiro + SomaSegundo;
        System.out.println("\n" + i + " - Somatoria final: " + somaFinal + "\n");
    }
}