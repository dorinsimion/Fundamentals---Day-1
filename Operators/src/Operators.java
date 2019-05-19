public class Operators {
    public static void main(String[] args) {
//        int a=5;
        int b=6;
//        int c = a+b;
//        int d=a-b;
//        int modulo = b%a;
//        System.out.println("Sum: " + c);
//        System.out.println("Difference: "+ d);
//        System.out.println("Modulo: "+ modulo);
//
//        //relational operators
//        boolean b1 = a<b;
//        boolean b2 = a>b;
//        boolean b3 = a==b;
//        boolean b4 = a!=b;
//        System.out.println(b3 + "\n" + b4);
//
//        //logical operators
//        boolean b5 = a>=5 && a<18;
//        boolean b6 = a>b || a>c;
//        boolean b7 = b1 && b2;
//        boolean b8 = !b7;
//        System.out.println(b7 + " " + b8);
//
//        boolean b9 = a>=5 & a<18;
//        boolean b10 = b1 | b2;
//        System.out.println("&& "+b5 +"\n& "+b9);
//        int d1 = a|b;
//        System.out.println(d1);
        int  x1 = 5;
        x1=x1+b;
        x1+=b;
        x1-=b;
        x1/=b; //x1 = x1/b
        x1%=b;
        x1=x1+1;
        x1+=1;
        x1=5;
        x1++;
        System.out.println(x1);
        x1--;
        ++x1;
        --x1;
        x1 = 5;
        int x2=4;
        int x3 = x1 + --x2;
        System.out.println("x3:" + x3 + "\nx2:"+x2);
        x3=0;
        x3 =(x1+x2)*2;
        System.out.println("Ana are mere");
        System.out.println("Ana are"+ " mere");

        int i1 =10;
        double d1 = i1;
        double d2 = 10.9;
        int i2 = (int) d2;
        System.out.println(i2);
        long l = 100;
        short s1=(short)l;
        int i3 = 12;
        byte b2= (byte)i3;
        System.out.println(b2);
        double d3 = 11.234;
        int i4 = (int) d3;
        char c = 'a';
        int i5 = (int) c;
        System.out.println(i5);
        double x = i4+c;
        i4 = (int)(l+d2);
        String s = "abc";
    }
}
