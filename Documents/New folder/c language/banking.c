#include<stdio.h>
int main(){
    struct bank{
        char name[100];
        int ac;
        float amount;
    }a[5];

    for (int i=0;i<5;i++){
        printf("Enter name account number and amount:\n");
        scanf("%s%d%f",&a[i].name,&a[i].ac,&a[i].amount);
    }

    printf("Displaying Information:\n\n");
    for (int i=0;i < 5;i++){
        printf("\nName : %d\n",a[i].name);
        printf("Account no. : %d\n",a[i].ac);
        printf("Amount: %f", a[i].amount);
        printf("\n");
    }
    return 0;
}