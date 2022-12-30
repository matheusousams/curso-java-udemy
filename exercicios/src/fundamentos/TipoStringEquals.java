
package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String entrada = scanner.next();
		System.out.println("7" == entrada); //false
		System.out.println("7".equals(entrada)); //true
		//o trim é necessario em nextLine, mas não em next
		
		scanner.close();
	}
}
