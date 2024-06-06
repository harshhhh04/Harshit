#include <stdio.h>
#include<string.h>
int main(){
    char input[100];
    printf("Now this code will print the size of all datatypes you need just enter its name:");
    scanf("%s", &input);
    char a[100] = "int";
    char b[100] = "char";
    char c[100] = "float";
    char d[100] = "double";

    if (strcmp(input, a) == 0){
        printf("%d bytes", sizeof(int));
    }
    else if(strcmp(input, b) == 0){
        printf("%d bytes", sizeof(char));
    }
    else if(strcmp(input, c) == 0){
        printf("%d bytes", sizeof(float));
    }
    else if(strcmp(input, d) == 0){
        printf("%d bytes", sizeof(double));
    }
    else{
       printf("yet to be coded");
        
    }

    return 0;
    
}