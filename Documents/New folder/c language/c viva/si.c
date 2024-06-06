#include<stdio.h>
int main(){
    enum amount;
    enum rate_of_interest;
    enum time_period;
    enum simple_interest;
    int amount,rate_of_interest,time_period,simple_interest;
    printf("Enter the amount:");
    scanf("%d",&amount);
    printf("\nEnter the rate of interest:");
    scanf("%d",&rate_of_interest);
    printf("\nEnter the time period per annum:");
    scanf("%d",&time_period);
    
    simple_interest = (amount*rate_of_interest*time_period)/100;
    printf("%d",simple_interest);
    

}