import java.util.*;
public class javabasics{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        for ( int i = 0;i<=n;i++){
            int k = 1;
            int a = n;
            for (int j  = a-i;j>0;j--){
                System.out.print(k);
                k++;
            }
            System.out.print("\n");
        }
        sc.close();
    }
}