package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	public Data() {
//		dia=1;
//		mes=1;
//		ano=1970;
		this(1, 1, 1970);
	}
	
	public Data(int dia, int mes, int ano) {
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
	}
	
	String obterData() {
//		return dia + "/" + mes + "/" + ano;
		String formato = "%d/%d/%d";
		return String.format(formato, dia, mes, ano);
	}
}
