package day_3_backup.parte1_2;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Utilitarios u = new Utilitarios();
        List<String> linhasArquivo = u.lerArquivo("C://Users//c3714035//IdeaProjects//AdventCode2023//src//day_3//Arquivo");

        Token t = new Token();
        AreaContato a = new AreaContato();
        t.mapearToken(linhasArquivo,a);
        a.mostrarAreaContato(a.getListaDeAreas());


    }
}
