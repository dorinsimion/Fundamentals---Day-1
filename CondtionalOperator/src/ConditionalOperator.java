public class ConditionalOperator {
    /*
    Operatorul ternar:
       Structura:
        conditie ? rezultat if conditie true : rezultat if conditie false
     */
    public static void main(String[] args) {
        int a = 18;
        String s = a>18 ? "Ok": (a<5 ? "Not OK":"AAA");
        System.out.println(s);
    }
}
