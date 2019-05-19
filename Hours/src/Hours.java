public class Hours {
    /*
    Adunam 2 intervale orare(ora,minute,secunde) si afisam rezultatul
     */
    public static void main(String[] args) {
        int h1=12;
        int m1=20;
        int s1=50;
        int h2=13;
        int m2=41;
        int s2=10;
        s1+=s2;
        if(s1>59){
            s1-=60;
            m1++;
        }
        m1+=m2;
        if(m1>59){
            m1-=60;
            h1++;
        }
        h1+=h2;
        if(h1>23){
            h1-=24;
        }

        System.out.println("It's "+h1+":"+m1+":"+s1);
    }
}
