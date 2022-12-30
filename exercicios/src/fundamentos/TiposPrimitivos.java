package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//informacoes do funcionario
		
		//Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223l; //passou numero maximo de inteiro precisa dizer que � tipo long
		
		//Tipos num�ricos reais
		float salario = 11_445.44f;
		double vendasAcumuladas = 2_991_797_103.02;
		
		//TIpo booleano
		boolean estaDeFerias = false; //true
		
		//Tipo caractere
		char status = 'A'; //ativo
		
		//Dias de Empresa
		System.out.println(anosDeEmpresa * 365);
		//N�mero de viagens
		System.out.println(numeroDeVoos / 2);
		//Pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("F�rias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}