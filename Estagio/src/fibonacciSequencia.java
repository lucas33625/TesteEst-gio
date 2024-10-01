import java.util.Scanner;

public class fibonacciSequencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        // Verifica se o número faz parte da sequência de Fibonacci
        if (efibonacci(num)) {
            System.out.println(num + " faz parte da sequência de Fibonacci.");
        } else {
            System.out.println(num + " não faz parte da sequência de Fibonacci.");
        }
        
        scanner.close();

    }
     
    //metodo que verifica se um número e parte da sequência de Fibonacci
    public static boolean efibonacci(int num){
        int a = 0, b = 1;

        while (a < num) {
            int next = a + b;
            a = b;
            b = next;
        }    
        return a == num;
        
    }
}


