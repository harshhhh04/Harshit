import java.util.*;
public class triplets{
    public static int tripletcheck(int num[]){
        if(num.length<3){
            return 0;
        }
        else{
            for(int i = 0; i < num.length - 2; i= i + 3){
                for(int j = 1; j < num.length -1; j = j + 3){
                    for(int k = 2; k < num.length; k = k +3){
                        if ( num[i] + num[j] + num[k] == 0){
                            int sol[] = {num[i],num[j],num[k]};
                            System.out.println(num[i]);
                            System.out.println(num[j]);
                            System.out.println(num[k]);
                        }
                    }
                }
            }
        }
        return 0;
    }
    public static void main(String args[]){
        int num[] = {-1, 0,  1, 2, -1, -4};
        tripletcheck (num);

    }
}