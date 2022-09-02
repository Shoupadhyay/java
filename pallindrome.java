import java.util.*;

public class pallindrome {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    int b=a.length()-1;
int c=0;
    System.out.println(b);
   for(int i=b; i>=0; i--){
       for(int j=0; j<a.length(); j++) {
           if(j!=i){
               c++;
           }

       }
   }
   if(c==1){
       System.out.println(" not pallindrome");
   }
   else{
       System.out.println(" palllindrome");
   }

        

    }
     
    
    
}

