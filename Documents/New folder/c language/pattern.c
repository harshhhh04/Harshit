#include<stdio.h>

int main() {
    int a,i,j;
    // printf("enter the number of rows: ");
    // scanf("%d",&a);
    a = 4;
    
    for(i=1;i<=a;i++){
        for(j=1;j<=i;j++){
        printf("*");
        }
            
        printf("\n");
    }
    return 0;
}
