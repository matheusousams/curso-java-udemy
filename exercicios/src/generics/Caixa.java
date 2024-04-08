package generics;

public class Caixa<G> {

    private G coisa;

    public void aguardar(G coisa) {
        this.coisa = coisa;
    }

    public G abrir() {
        return coisa;
    }
}