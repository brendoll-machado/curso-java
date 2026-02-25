import java.util.*;
public class Multiplicacao {
    public static void main (String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número a ser multiplicado e tecle Enter");
        String respostaUsuario = inputScanner.nextLine().trim();
        int numeroUm = Integer.valueOf(respostaUsuario);
        System.out.println("Digite o segundo número a ser multiplicado e tecle Enter");
        respostaUsuario = inputScanner.nextLine().trim();
        int numeroDois = Integer.valueOf(respostaUsuario);
        System.out.println("O resultado da multiplicação é: " + (numeroUm * numeroDois));
        inputScanner.close();
    }    
}