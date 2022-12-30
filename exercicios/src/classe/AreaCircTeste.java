package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCirc area = new AreaCirc(10);
		System.out.println(area.area());
		
		AreaCirc area2 = new AreaCirc(5);
		System.out.println(area2.area());
		
//		AreaCirc.PI = 3.1415;
		
		AreaCirc area3 = new AreaCirc(10);
		System.out.println(area3.area());
		
		System.out.println(AreaCirc.area(1000));
		
		System.out.println(Math.PI);
	}
}
