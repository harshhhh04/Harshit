public class recursionbasics {
    public static void printdec(int n){
        if(n ==1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printdec(n-1);
        
    }

    public static void printinc(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        printinc(n-1);
        System.out.print( " " + n);
        
    }

    public static int factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int factnm1 = factorial(n-1);
        int factn = n * factorial(n-1);
        return factn;
    }

    public static int sum_of_n(int n){
        int sum;
        if(n == 1){
            return 1;
        }
        sum = n + sum_of_n(n-1);
        return sum;
    }

    public static int fibseries(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        int ans;
        ans = fibseries(n-1) + fibseries(n-2);
        return ans;
    }

    public static boolean sortedarray(int arr[], int i){
        if( i == arr.length - 1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return sortedarray(arr, i + 1);
    }


    public static void main(String args[]){
        int n = 4;
        int arr[] = {0,1,2,7,5};
        System.out.println(sortedarray(arr, 0));
    }
}
