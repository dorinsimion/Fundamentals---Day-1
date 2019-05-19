import java.util.Scanner;

// de cate ori se impare un numr dat de la tastura la 2
public class DivideBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int numberToBeChecked = scanner.nextInt();
        int x = numberToBeChecked;
        int result=0;
        while(numberToBeChecked%2==0){
            numberToBeChecked/=2;
            result++;
        }
        System.out.println("Number " + x + " divide by 2 " + result + " times!");
    }
}
