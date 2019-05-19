public class IfStatement {
    public static void main(String[] args) {
        int varsta =17;
        char gender ='M';
        if(varsta <5){
            System.out.println("Vezi ce zice mami!");
        } else if(varsta<18) {
            System.out.println("Nu ai voie sa fumezi!");
            System.out.println("Si sa bei!");
        } else if(varsta <21){
            System.out.println("....");
        }
        else{
            System.out.println("Faci ce vrei tu!");
        }
    }
}
