import java.time.*;
import java.util.*;

public class Teste {
    public static void main(String[] args) {

        while (true) {
            // 1. Verifica se o usuário pressionou Enter
            try {
                if (System.in.available() > 0) {
                    System.out.println("\nContador parado pelo usuário.");
                    break; 
                }
            } catch (Exception e) {
                System.out.println("Erro ao ler teclado: " + e);
            }

            // 2. Captura e formata a hora atual
            LocalDateTime agora = LocalDateTime.now();
            int h = agora.getHour();
            int m = agora.getMinute();
            int s = agora.getSecond();

            // Formatação com %02d garante que 5 segundos apareçam como 05
            System.out.println("Relógio iniciado. Pressione ENTER para parar...");
            System.out.printf("%02d:%02d:%02d%n", h, m, s);


            // 3. Pausa de 1 segundo
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Erro: " + e);
            }

            // 4. Limpa o console
            limparConsole();
        }
    }

    // Transformei em método para organizar melhor o código
    public static void limparConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            // Silencioso se falhar a limpeza
        }
    }
}