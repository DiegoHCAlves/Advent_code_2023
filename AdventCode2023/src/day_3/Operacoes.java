package day_3;

import java.util.List;

public class Operacoes {

    public void mapearTokens(List<String> linhasArquivo) {
        for(String linha : linhasArquivo){
            for(int i=0; i < linha.length(); i++){
                if(Character.isDigit(linha.charAt(i))){
                } else if (linha.charAt(i) == '.'){
                } else {
//                    Token token = new Token();
                }
            }
        }
    }

}
