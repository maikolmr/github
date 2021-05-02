package lambdas;

import java.util.function.BinaryOperator;

public class Lambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("teste");
		Runnable tarefa = () -> System.out.println("Hello!");
		tarefa.run();
		
		BinaryOperator<Double> calc = (a,b) -> a+b;
		Double res = calc.apply(3.0, 4.0);
		
		System.out.println(res);
		

	}

}
