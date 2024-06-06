import java.util.*;
public class floyd{
    public static int Linearsearch (int num[], int key){
    for(int i=0; i< num.length;i++ ){
        if (num[i] == key){
            return i;
        }
    }
    return -1;
    }
    public static void main(String args[]){

        int array[] = {2,3,4,5,6,7,8};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find: ");
        int find = sc.nextInt();
        System.out.println("The index is " + Linearsearch(array,find));
        sc.close();
    }
}