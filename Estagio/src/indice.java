public class indice {
    public static void main(String[] args) {
        int indice = 12;
        int SOMA = 0;
        int K = 1; 

        //A resposta será 77
        while (K < indice) {
            K = K + 1; 
            SOMA = SOMA + K;
            
            System.out.println(SOMA);
        }
    }
}
