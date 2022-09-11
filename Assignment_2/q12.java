import java.util.*;


public class q12 {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
    int a = sc.nextInt();
    if((a%4==0||a%400==0)&&a%100!=0){
        System.out.println("it is a leap yar");
    }
else {
    System.out.println("not a leap year");
}
}

}
