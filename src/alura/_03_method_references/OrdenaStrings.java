package alura._03_method_references;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import static java.util.Comparator.comparing;

public class OrdenaStrings {

	public static void main(String[] args) {
		
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");
		
		System.out.println(palavras);
		
//		palavras.sort( (s1, s2) -> Integer.compare(s1.length(), s2.length()) );
		
//		palavras.sort(Comparator.comparingInt(s -> s.length()));
		
		palavras.sort(Comparator.reverseOrder());
		
				
		palavras.forEach(System.out::println);
		
		UnaryOperator<String> operador = new OperadorDeString(); 
		palavras.replaceAll(operador);
		
		palavras.forEach(s -> System.out.println(s));
		
		new Thread( () -> System.out.println("Executando um Runnable") ).start();
	}
}

class OperadorDeString implements UnaryOperator<String> {

	@Override
	public String apply(String s) {
		
		return String.valueOf(s.length());
	}
	
}




