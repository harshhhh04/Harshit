import java.util.*;
public class sum_functions{
    public static void factorial(int a){
        int factorial;
        if(a>1){

            for (int i = a; a > 1;i--){
                 factorial = i*(i-1);
                 System.out.println(factorial);
                }
                 
        }
        else{
             factorial = 1;
             System.out.println(factorial);
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // int b = sc.nextInt();
        factorial(a);
        sc.close();
    }
    
}
