import java.util.Scanner;

public class Alarm {
    public static void main(String[] args) {
        int wakeUp=8;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set current hour: ");
        int currentHour = scanner.nextInt();

        while(currentHour<wakeUp){
            System.out.println("It's "+currentHour+" o'clock.I'm still sleeping");
            currentHour++;
        }
        System.out.println("Wake-up");
    }
}
