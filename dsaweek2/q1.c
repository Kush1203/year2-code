#include <stdio.h>
#include <ctype.h>

char stack[100];
int top = -1;
// push code
void push(char x) {
    stack[++top] = x;
}
// pop code
char pop() {
return stack[top--];
}
//order logic
int logic(char x) {
if (x == '+' || x == '-') return 1;
if (x == '*' || x == '/') return 2;
return 0;
}

int main() {    
char infix[100], postfix[100];
int i = 0, j = 0;
printf("Enter infix: ");
scanf("%s", infix);
while (infix[i] != '\0') {

// if operand
        if (isalnum(infix[i])) {   //isalnum-Is this character a letter OR number?
            postfix[j++] = infix[i];
}

// if '('
        else if (infix[i] == '(') {
            push(infix[i]);
}
// if ')'
        else if (infix[i] == ')') {
            while (stack[top] != '(') {
                postfix[j++] = pop();
}
            pop(); // remove '('
}
// operation
else{
 while (top != -1 && prec(stack[top]) >= prec(infix[i])) 
{  postfix[j++] = pop();  }
push(infix[i]);
}
i++;
}
// pop remaining
while (top != -1) 
{postfix[j++] = pop();}
postfix[j] = '\0';
printf("Postfix: %s\n", postfix);
return 0;
}
