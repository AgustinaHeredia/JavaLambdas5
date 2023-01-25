package FunctionalInterface;

public class App {

	public static void main(String[] args) {
		PiValue piValue = () -> 3.1415;
        System.out.println("El valor de Pi es: " + piValue.getPiValue());

	}

}
