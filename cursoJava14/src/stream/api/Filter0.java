package stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Filter0 {
	
	public static void main(String[] args) {
		List<Integer> numbers =
				Arrays.asList(new Integer[] {4,1,9,6,8,3,5,10,7});
		
				numbers.stream()
					.filter(n -> n > 5)
					.map(n -> n * n)
					.forEach(System.out::println);
				
//				System.out.println("\n retorno de um Stream: ");
//				Stream<Integer> s = numbers.stream().
//						filter(n -> n <= 5 && n >= 3);
//				s.forEach(System.out::println);
	}
}
