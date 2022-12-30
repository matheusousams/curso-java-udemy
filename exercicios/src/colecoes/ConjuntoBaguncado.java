package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings("unchecked") //usar Ctrl+1
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes") //usar Ctrl+1
		HashSet conjunto = new HashSet();
		
		conjunto.add(1);
		conjunto.add(1.2);
		conjunto.add("String");
		conjunto.add('c');
		conjunto.add(false);
		
		System.out.println("Tamanho: " + conjunto.size());
		
		conjunto.add("string");
		System.out.println("Tamanho: " + conjunto.size());
		
		System.out.println(conjunto.remove('C'));
		System.out.println(conjunto.remove(1.2));
		
		System.out.println("Tamanho: " + conjunto.size());
		
		System.out.println(conjunto.contains(true));
		System.out.println(conjunto.contains("STRING"));
		System.out.println(conjunto.contains("string"));
		
		@SuppressWarnings("rawtypes")
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
//		conjunto.addAll(nums);
//		System.out.println(conjunto);
		
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		
	}
}
