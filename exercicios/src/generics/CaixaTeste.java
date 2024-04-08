package generics;

public class CaixaTeste {
    public static void main(String[] args) {
        
        Caixa<Double> caixaA = new Caixa<>();
        caixaA.aguardar(4.77);

        double coisaA = caixaA.abrir();
        System.out.println(coisaA);
    }
}
