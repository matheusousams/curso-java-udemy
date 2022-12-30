package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data = new Data();
		
		System.out.println(data.obterData());

		Data data2 = new Data(29,12,2022);
		
		String obterData2 = data2.obterData();
		System.out.println(obterData2);
		
	}
}
