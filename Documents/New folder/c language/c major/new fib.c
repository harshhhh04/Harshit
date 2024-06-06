#include <stdio.h>
int main(){
    int a,b,c,d;
    a = 0;
    b = 1;
    int t = a+b;
    printf("number of terms:");
    scanf("%d",&c);
    printf("fibonacci series: %d , %d, "",",a,b);
    for(d =3; d<=c;d++){
        printf(" %d "",",t);
        a = b;
        b = t;
        t = a+b;
    }
    return 0;
}