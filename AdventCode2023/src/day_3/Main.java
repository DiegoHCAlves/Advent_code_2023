package day_3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Utilitarios u = new Utilitarios();
        u.teste(u.lerArquivo("C:\\Users\\c3714035\\IdeaProjects\\AdventCode2023\\src\\day_3\\Arquivo"));
        u.mapearPosicoes(u.lerArquivo("C:\\Users\\c3714035\\IdeaProjects\\AdventCode2023\\src\\day_3\\Arquivo"));

    }
}
