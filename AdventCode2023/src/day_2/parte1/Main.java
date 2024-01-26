package day_2.parte1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws IOException {
        //Leitura do arquivo
        Path Arquivo = Paths.get("C://Users//c3714035//IdeaProjects//AdventCode2023//src//day_2//Arquivo");
        //Separando o arquivo em linhas
        List<String> linhasArquivo = Files.readAllLines(Arquivo);
        //Declarando variáveis que irei usar
        String[] separar, jogos;
        String titulo, corpo;
        int soma = 0, id = 0;

        //Iterando cada uma das linhas
        for (String linha : linhasArquivo) {
            //Atribuindo incremento no id e um contador que receberá o id quando critérios forem atendidos
            id++;
            int contador = id;

            //Separando titulo do corpo
            separar = linha.split(":");
            titulo = separar[0];
            corpo = separar[1];

            //Separando cada pequeno bloco do corpo
            jogos = corpo.split(";|,");

            //Iterando cada pequeno bloco de jogo
            for (String jogo : jogos) {
                //Verificando se o azul apareceu
                if (jogo.contains("blue")) {
                    String v = "";
                    for (int i = 0; i < jogo.length(); i++) {
                        if (Character.isDigit(jogo.charAt(i))) {
                            //Armazena os valores que sao digitos
                            v += String.valueOf(jogo.charAt(i));
                        }
                    }
                    //Convertendo em numero e verficando se é maior que 14.
                    int valor = parseInt(v);
                    if (valor > 14) {
                        contador = 0;
                    }
                } else if (jogo.contains("red")) {
                    String v = "";
                    for (int i = 0; i < jogo.length(); i++) {
                        if (Character.isDigit(jogo.charAt(i))) {
                            v += String.valueOf(jogo.charAt(i));
                        }
                    }
                    int valor = parseInt(v);
                    if (valor > 12) {
                        contador = 0;
                    }
                } else if (jogo.contains("green")) {
                    String v = "";
                    for (int i = 0; i < jogo.length(); i++) {
                        if (Character.isDigit(jogo.charAt(i))) {
                            v += String.valueOf(jogo.charAt(i));
                        }
                    }
                    int valor = parseInt(v);
                    if (valor > 13) {
                        contador = 0;
                    }
                }

            }

            soma += contador;
            System.out.println("Soma final: " + soma);

        }

    }
}
