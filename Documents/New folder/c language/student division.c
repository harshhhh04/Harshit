#include <stdio.h>

int main(){
    int a,b,c,d,e,div;
    float per;
    printf("enter the marks in subject 1: ");
    scanf("%d",&a);
    printf("\nenter the marks in subject 2: ");
    scanf("%d",&b);
    printf("\nenter the marks in subject 3: ");
    scanf("%d",&c);
    printf("\nenter the marks in subject 4: ");
    scanf("%d",&d);
    printf("\nenter the marks in subject 5: ");
    scanf("%d",&e);

    per = (a+b+c+d+e)/5;
    
     if (per < 40){
        printf("FAIL!!!!!!!!!!! PADHAI KAROOO");
    }
    else{
        if (per >= 40 && per <=49){
            div = 3;
        }
        else if(per >50 && per <=59){
            div =2;
        }
        else{
            div =1;
        }
        printf("division : %d",div);
    }
return 0;


}

