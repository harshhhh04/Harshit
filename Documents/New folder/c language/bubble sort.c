#include<stdio.h>
int main(){
    int arr[] = {-5,10,56,5,-500,8};
    int n = 6;
    int temp;

    for (int t = 1; t<=n-1; t++){
        for (int j=0; j<=n - t - 1; j++){
            if (arr[j] > arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }

    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
return 0;

}