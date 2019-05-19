import java.util.Scanner;

// afisam daca un numar dat de la tastatura coresunde unei zi din cursul saptamanii
// 1-5 , sau zilelor de weekend 6-7 . altfel afisam un mesaj default
public class Weekdays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5 :
                System.out.println("Week day!");
                break;
            case 6:
            case 7:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("No day");
        }
    }
}
