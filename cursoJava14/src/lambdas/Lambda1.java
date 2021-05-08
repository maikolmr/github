package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

public class Lambda1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("teste");
		Runnable tarefa = () -> System.out.println("Hello!");
		tarefa.run();
		
		BinaryOperator<Double> calc = (a,b) -> a+b;
		Double res = calc.apply(3.0, 4.0);
		System.out.println(res);
		
		Supplier<String> produto = () -> "Hello";
		System.out.println(produto.get());
		
		Supplier<Double> numero = () -> 14.9;
		System.out.println(numero.get());
		
		Function<String, Integer> fsize = s -> s.length(); 
		System.out.println(fsize.apply("teste"));
	}

}
