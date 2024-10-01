import java.util.Scanner;

public class verificadorLetra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra que contenha letra A: ");

        String input = scanner.nextLine();

        int count = contadorLetraA(input);
        
        //Verifica se a letra "A" foi encontrada
        if (count > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) ocorre " + count + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' (maiúscula ou minúscula) não ocorre na string.");
        }
        
        scanner.close();
    }
    //Conta quantas letras está presente na palavra
    public static int contadorLetraA(String str) {
        int contador = 0;

        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'A') {
                contador++;
            }
        }
        
        return contador;
    }
}