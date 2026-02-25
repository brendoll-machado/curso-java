import java.util.*;
public class Divisao {
    public static void main (String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Digite o dividendo e tecle Enter");
        String respostaUsuario = inputScanner.nextLine().trim();
        int numeroUm = Integer.valueOf(respostaUsuario);
        System.out.println("Digite o divisor e tecle Enter");
        respostaUsuario = inputScanner.nextLine().trim();
        int numeroDois = Integer.valueOf(respostaUsuario);
        double resultado = (double) numeroUm/numeroDois; //Precisa reinstanciar novamente
        System.out.println("O resultado da divisão é: " + resultado);
        inputScanner.close();
    }    
}