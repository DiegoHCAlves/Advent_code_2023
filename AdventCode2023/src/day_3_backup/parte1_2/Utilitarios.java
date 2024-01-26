package day_3_backup.parte1_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Utilitarios {

    public List<String> lerArquivo(String caminho) throws IOException {
        Path Arquivo = Paths.get(caminho);
        return Files.readAllLines(Arquivo);
    }

    public void teste(List<String> linhasArquivo){
        for (String linha : linhasArquivo){
            System.out.println(linha);
        }
    }




}
