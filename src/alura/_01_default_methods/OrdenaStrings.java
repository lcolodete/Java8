package alura._01_default_methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class OrdenaStrings {

	public static void main(String[] args) {
		
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");
		
		System.out.println(palavras);
		
		Comparator<String> comparador = new ComparadorDeStringPorTamanho();
		
		palavras.sort(comparador);
		
//		for (String p : palavras) {
//			System.out.println(p);
//		}
		
		Consumer<String> consumidor = new ConsumidorDeString();
		palavras.forEach(consumidor);
		
		UnaryOperator<String> operador = new OperadorDeString(); 
		palavras.replaceAll(operador);
		
		palavras.forEach(consumidor);
	}
}

class OperadorDeString implements UnaryOperator<String> {

	@Override
	public String apply(String s) {
		
		return String.valueOf(s.length());
	}
	
}

class ConsumidorDeString implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.println(s);
	}
	
}

class ComparadorDeStringPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}
	
}
