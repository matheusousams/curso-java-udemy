package generics;

public class CaixaNumeroTeste {
    
    public static void main(String[] args) {
        
        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.aguardar(3.7);
        System.out.println(caixaA.abrir());

        CaixaNumero<Integer> caixaB = new CaixaNumero<>();
        caixaB.aguardar(7);
        System.out.println(caixaB.abrir());
    }
}
