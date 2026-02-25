import java.util.*;
public class Soma {
    public static void main (String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número a ser somado e tecle Enter");
        String respostaUsuario = inputScanner.nextLine().trim();
        int numeroUm = Integer.valueOf(respostaUsuario);
        System.out.println("Digite o segundo número a ser somado e tecle Enter");
        respostaUsuario = inputScanner.nextLine().trim();
        int numeroDois = Integer.valueOf(respostaUsuario);
        System.out.println("O resultado da soma é: " + (numeroUm + numeroDois));
        inputScanner.close();
    }    
}
