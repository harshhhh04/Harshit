#include<stdio.h>
int main(){
    int a[] = {-2,7,45,3,67,2};
    int n = 6;
    int temp;
    for(int j = 0;j<n;j++){
        for( int i = 0;i<n;i++){
            if(a[i]>a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                for(i = 0; i < n; i++){
                    printf("%d,\t",a[i]);
                }

            }
        printf("\n");
        }
    }
    return 0;
}