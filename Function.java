import java.util.*;

public class Function {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Digite sua idade, para avaliar o seu pedido de aposentadoria, depois tecle Enter");
        Integer idade = inputScanner.nextInt();
        System.out.println("Você está " + validarAposentadoria(idade) + " para iniciar sua aposentadoria");
        inputScanner.close();
    }

    public static String validarAposentadoria(Integer idade) {
        if (idade >= 65) {
            return "Apto";
        } else {
            return "Inapto";
        }

    }
}
