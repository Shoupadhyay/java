import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the breadth and lenght");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=2*a*b;
        int d= 2*(a+b);
        System.out.println("the area and perimeter are "+" "+c+" "+
        d+"respectively");

    }
    
}
