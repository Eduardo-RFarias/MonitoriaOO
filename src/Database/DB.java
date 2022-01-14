package Database;

import java.util.ArrayList;

import model.Pessoa;

public class DB {
    private static final ArrayList<Pessoa> pessoas = new ArrayList<>();

    public static ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }
}
