import java.util.*;
public class arraycompare{
    public static boolean compare(int num[]){
        int a = num.length;
        for(int i = 0;i<a;i++){
            for(int j = i+1; j<a;j++){
                if(num[i] == num[j]){
                    return true;
                }
                }
            }
        return false;    
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num[] = {1,2,3,1};
        System.out.println(compare(num));
        sc.close();
    }
}
