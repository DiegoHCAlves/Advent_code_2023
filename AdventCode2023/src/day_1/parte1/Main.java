package day_1.parte1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws IOException {

        Path Arquivo = Paths.get("C://Users//c3714035//IdeaProjects//AdventCode2023//src//day_1//Arquivo");

        Map<String, String> conversao = new HashMap<>();
        conversao.put("one", "1");
        conversao.put("two", "2");
        conversao.put("three", "3");
        conversao.put("four", "4");
        conversao.put("five", "5");
        conversao.put("six", "6");
        conversao.put("seven", "7");
        conversao.put("eight", "8");
        conversao.put("nine", "9");

        List<String> linhasArquivo = Files.readAllLines(Arquivo);
        int somaFinal = 0;
        int i = 1;
        Character primeiro = null, ultimo = null;

        for (String linha : linhasArquivo) {
            for (String chave : conversao.keySet()) {
                String res = linha;
                res = res.replace(chave, String.valueOf(conversao.get(chave)));

                Loop:
                for (int j = 0; j < linha.length(); j++) {
                    if (linha.isEmpty()) {
                        break Loop;
                    } else if
                    (Character.isDigit(linha.charAt(j))) {
                        primeiro = linha.charAt(j);
                        break Loop;
                    }
                }

                Loop:
                for (int j = linha.length() - 1; j >= 0; j--) {
                    if (linha.isEmpty()) {
                        break Loop;
                    } else if (Character.isDigit(linha.charAt(j))) {
                        ultimo = linha.charAt(j);
                        break Loop;
                    }
                }
            }

//            String s = "" + primeiro + ultimo;
            StringBuilder s = new StringBuilder().append(primeiro).append(ultimo);
            int soma = parseInt(s.toString());
            somaFinal = somaFinal + soma;

        }
        System.out.println("\n" + "Somatoria final: " + somaFinal + "\n");
    }
}
