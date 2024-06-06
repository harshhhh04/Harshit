#include <stdio.h>
#include <math.h>
int main(){
    int n,p;
    float s;
    printf("enter no ");
    scanf("%d",&n);
    p = pow(n,2);
    s = sqrt(n);
    printf("%d  %f",p,s);
    return 0;
}
