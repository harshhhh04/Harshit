// write a program to print 2d array in matrix form and calculate the sum for all arrays
#include<stdio.h>

int main(){
    int arr[2][3];
    int sum=0;
    int n;

    for(int i=0;i<2;i++){
        for(int j=0;j<3;j++){
            printf("Enter num: ");
            scanf("%d",&n);
            arr[i][j] = n;
            sum+=n;
        }
    }

    for(int i=0;i<2;i++){
        for(int j=0;j<3;j++){
           printf("%d \t",arr[i][j]);
        }
        printf("\n");
    }

    printf("sum of all elements: %d",sum);
    return 0;

}