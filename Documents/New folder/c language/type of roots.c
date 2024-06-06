#include<stdio.h>
#include<math.h>
int main(){
    int a,b,c;
    float d,r1,r2;
    printf("Enter values of coefficients a , b , c of ax^2 + bx +c ");
    scanf("%d%d%d", &a,&b,&c);
    d = (b*b) - (4*a*c);
    if (d>0){
        r1 = (sqrt(d) - b)/(2*a);
        r2 = (-b -sqrt(d))/(2*a);
        printf("roots: %f and %f",r1,r2);
        printf("riyal roots");
    }
    if(d ==0){
        r1 = -b/(2*a);
        r2 = r1;
        printf("roots: %f and %f",r1,r2);
        printf("riyal and equal roots");
    }
    if(d<0){
        d = abs(d);
        r1 = (sqrt(d) - b)/(2*a);
        r2 = (-b -sqrt(d))/(2*a);
        printf("roots: %fi and %fi",r1,r2);
        printf("unriyal roots");
}

}