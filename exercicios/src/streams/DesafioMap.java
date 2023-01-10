package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
				
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);		
		
		UnaryOperator<String> inverteNumero =
				m -> new StringBuilder(m).reverse().toString();
				
		Function<String, Integer> toIntString =
				m -> Integer.parseInt(m, 2);
		
		nums.stream().map(Integer::toBinaryString)
					 .map(inverteNumero)
					 .map(toIntString)
					 .forEach(System.out::println);
				
	}
}
