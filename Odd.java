import java.util.*;
public class Odd {
 
        public static void main(String[] args) {
               
              Scanner sc=new Scanner(System.in);
                int limit = sc.nextInt();
               
                System.out.println("Printing Odd numbers between 1 and " + limit);
               
                for(int i=1; i <= limit; i++){
                       
                       
                        if( i % 2 != 0){
                                System.out.print(i + " ");
                        }
                }
        }
}
