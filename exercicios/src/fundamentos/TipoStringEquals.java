
package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String entrada = scanner.next();
		System.out.println("7" == entrada); //false
		System.out.println("7".equals(entrada)); //true
		//o trim � necessario em nextLine, mas n�o em next
		
		scanner.close();
	}
}
