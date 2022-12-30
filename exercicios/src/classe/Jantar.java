package classe;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa people = new Pessoa("Matilda", 50.0);
		Comida dinner = new Comida("Pizza", 1.0);
		
		people.comer(dinner);
		
		System.out.println(people.peso);
	}
}
