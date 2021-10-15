package biblioteca;

public class Main
{
    public static void main(String args[])
    {
        // para futuro testes
        System.out.print(calcularFibonacciRecursivo(5));
    }
    
    static long calcularFibonacciRecursivo(int termo) {
		if(termo <= 2) {
			return 1;
		}
		else {
			return calcularFibonacciRecursivo(termo-1) + calcularFibonacciRecursivo(termo-2);
		} 	
    }
}
