import java.time.*;

public class Timer {
    public static void main(String[] args) {
        while (true) {
            int hourNow = LocalDateTime.now().getHour();
            int minuteNow = LocalDateTime.now().getMinute();
            int secondNow = LocalDateTime.now().getSecond();
            System.out.println(hourNow + ":" + minuteNow + ":" + secondNow);
            try {
                Thread.sleep(1000);
            }catch (Exception e) {
                System.out.println("Erro: " + e);
            }

            try {
                if (System.getProperty("os.name").
                contains("Windows")) {
                    new ProcessBuilder("cmd","/c", "cls").inheritIO().start().waitFor();
                } else {
                    System.out.println("\033[H\0332J");
                    System.out.flush();
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e);
            }
        }
    }
}
