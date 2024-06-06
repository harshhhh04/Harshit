#include <stdio.h>
int main()
{
  char op;
  int a , b;
  printf("enter a number:\n");
  scanf("%d", &a);
  printf("enter another number:\n");
  scanf("%d", &b);
  printf("enter the operator:");
  scanf("%c", &op);

  switch (op)
  {
  case '+':
    printf("The sum of numbers is %d", a + b);
    break;
  case '-':
    printf("the difference of numbers is %d", a - b);
    break;
  case '*':
    printf("the multiplication of numbers is %d", a * b);
    break;
  case '/':
    printf("the division of numbers is %d", a / b);
    break;
  default:
    printf("the operator is not correct");
  }
  return 0;
}

// #include <stdio.h>

// int main() {

//   char op;
//   double first, second;
//   printf("Enter an operator (+, -, *, /): ");
//   scanf("%c", &op);
//   printf("Enter two operands: ");
//   scanf("%lf %lf", &first, &second);

//   switch (op) {
//     case '+':
//       printf("%.1lf + %.1lf = %.1lf", first, second, first + second);
//       break;
//     case '-':
//       printf("%.1lf - %.1lf = %.1lf", first, second, first - second);
//       break;
//     case '*':
//       printf("%.1lf * %.1lf = %.1lf", first, second, first * second);
//       break;
//     case '/':
//       printf("%.1lf / %.1lf = %.1lf", first, second, first / second);
//       break;
//     // operator doesn't match any case constant
//     default:
//       printf("Error! operator is not correct");
//   }

//   return 0;
// }