#include<stdio.h>
void main(){

    int a,b,c,d;
    // c = 4;
    for(a = 1;a<=4;a++){
        for(b = 1;b<=a;b++){
            printf("*\t");
        }

        printf("\n");
    }
    d =3;
    for(a=5;a<=8;a++){
        for(b=d;b>0;b--){
            printf("* \t");
            
        }
        d = d-1;
        printf("\n");
    }
    return 0;
}