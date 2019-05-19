public class MaxOf3 {
    public static void main(String[] args) {
        int a=23;
        int b=24;
        int c=22;
        if(a>b && a>c){
            System.out.println(a);
        } else if( b>c){
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
