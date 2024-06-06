//write a program to display array and sum of elements in it
#include<stdio.h>
int main(){
    int i,j,n;
    int a[2][3];
    for(int i = 0; i<2; i++){
       for(int j = 0; j<3; j++){
        printf("enter number:(%d,%d):" , i,j);
        scanf("%d",&n);
        a[i][j] = n;
        
       }
}
        
    for(int i = 0; i<2; i++){
       for(int j = 0; j<3; j++){
        printf("%d\t",a[i][j]);
        
       }
       printf("\n");
    }


}