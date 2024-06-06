#include <string.h> 
#include <stdio.h> 
 
int main() { 
    char str1[10] = "Hello"; 
    char str2[10] = "Hello"; 
 
    if (strcmp(str1, str2) == 0) { 
        printf("The two strings are equal.\n"); 
    } else { 
        printf("The two strings are not equal.\n"); 
    } 
 
    return 0; 
} 