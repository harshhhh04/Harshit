#include<stdio.h>
int main(){
   int a[] = {2,4,6,8,9,7,5,3,1};
   int *p = a + 1;
   int *k = a + 5;
   printf("%d", k-p);
}