package lambdas;
public class Lambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("teste");
		Runnable tarefa = () -> System.out.println("Hello!");
		tarefa.run();

	}

}
