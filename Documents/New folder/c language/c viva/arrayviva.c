#include<stdio.h>
int main(){
    int a[2][3];
    int n;
    int sum = 0;
    for(int i = 0; i<2; i++){
        for(int j = 0;j<3;j++){
            printf("Enter the number(%d,%d)",i,j);
            scanf("%d",&n);
            sum = sum +n;
            printf("%d",sum);

        }
    }
    return 0;
}