public class FirstSwitch {
    public static void main(String[] args) {
        int dayOfweek=4;
        String day;
        switch(dayOfweek){
            case 1:
                day="Monday";
                break;
            default:
                day="Not exist";
                break;
            case 2:
                day="Tuesday";
                break;
            case 3:
                day="Wendsday";
                break;
            case 4:
                day="Thursday";
                break;
            case 5:
                day="Friday";
                break;
        }

        System.out.println(day);
    }
}
