import java.util.*;

public class q6 {
    public static void main(String[] args) {
    
    
    Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int x=(a>b&&a>c)?a:((b>c&&b>a)?b:c);
    int y=(a<b&&a<c)?a:((b<c&&b<a)?b:c);
    System.out.println(x+"is the oldest of all");
    System.out.println(y+"is the youngest of all");
    }
}
