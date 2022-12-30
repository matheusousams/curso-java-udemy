package fundamentos;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		double a = (Math.pow(6*(3+2), 2))/(3*2);
		double b = (Math.pow(((1-5)*(2-7))/2, 2));
		double c = Math.pow(10, 3);
		
		double d = Math.pow(a-b, 3);
		double e = d/c;
		
		System.out.println((int)e);
	}
}
