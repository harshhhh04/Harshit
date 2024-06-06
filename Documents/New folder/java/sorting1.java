import java.util.*;
public class sorting1{
    public static void printarr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print( arr[i] + " ");
        }
        }
    public static void bubblesort(int arr[]){
        for (int turn = 0;turn<arr.length-1;turn++){
            for(int i = 0;i<arr.length-1;i++){
                if(arr[i]<arr[i+1]){
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void selectionsort(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            int max = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[max]<arr[j]){
                   max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
    }
    public static void insertionsort(int arr[]){
        for(int i = 1;i<arr.length;i++){
            int curr = i;
            int prev = i-1;
            while(prev>=0 && arr[curr]<arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = arr[curr];
        }
    }
    public static void insertion(int arr[]){
        int n = arr.length;
        for (int i=1;i<=n-1;i++){

            int current = arr[i];
            int prev = i-1;
            while (prev>=0 && arr[prev]>current){
                arr[prev+1]=arr[prev];
                prev = prev -1;
            }
            arr[prev+1] = current;
    
        }
    }
    public static void countingsort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int[largest + 1];
        for(int i = 0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j = 0;
        for(int i = count.length-1; i>0;i--){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    
    public static void main(String args[]){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        // int arr[] = {5,4,1,3,2};
    //    insertion(arr);
       countingsort(arr);
       printarr(arr);
       // System.out.println(arr.length);

    }
}