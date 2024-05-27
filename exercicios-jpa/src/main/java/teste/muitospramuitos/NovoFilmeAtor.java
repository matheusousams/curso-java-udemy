package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {

    public static void main(String[] args) {

        Filme filmeA = new Filme("Minha mãe é uma peça", 10.0);
        Filme filmeB = new Filme("Vai que cola", 9.0);
        Filme filmeC = new Filme("Tô Ryca", 8.0);

        Ator atorA = new Ator("Paulo Gustavo");
        Ator atrizB = new Ator("Samantha Schmutz");

        filmeA.adicionarAtor(atorA);
        filmeA.adicionarAtor(atrizB);

        filmeB.adicionarAtor(atorA);

        filmeC.adicionarAtor(atrizB);

        DAO<Filme> dao = new DAO<Filme>();
        dao.incluirAtomico(filmeA);
    }
}
