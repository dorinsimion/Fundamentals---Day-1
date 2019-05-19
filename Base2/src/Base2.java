import java.util.Scanner;
//numarul in baza 2
/*
Rezolvare: se imparte numarul la 2 pana catul devine 0 si se concateneaza resturile
 */
public class Base2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String result="";
        do {
            result=n%2+result;
            n/=2;
        } while(n!=0);
        System.out.println(result);
    }
}
