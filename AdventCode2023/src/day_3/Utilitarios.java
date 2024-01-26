package day_3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Utilitarios {

    Map<Integer,List<Integer>> linhas = new HashMap<>();


    public List<String> lerArquivo(String caminho) throws IOException {
        Path Arquivo = Paths.get(caminho);
        return Files.readAllLines(Arquivo);
    }

    public void teste(List<String> linhasArquivo){
        for (String linha : linhasArquivo){
            System.out.println(linha);
        }
    }

    public void mapearPosicoes(List<String> linhasArquivo) {
        for(int j = 0; j < linhasArquivo.size(); j++){
            List<Integer> colunas = new ArrayList<>();
            for(int i = 0; i < linhasArquivo.get(j).length(); i++){
                colunas.add(i);
            }
            linhas.put(j,colunas);
        }
    }





}
