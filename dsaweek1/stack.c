//creating push and pop function 

//make stack structure first 
#include <stdio.h> 
#define MAX 100 
int stack[MAX]; 
int top = -1; //empty stack has top=-1 
int value; 
//push function 
void push(int value) 
{ if (top==MAX-1) 
	{ printf("overflow"); 
	return; 
} 
top++; 
stack[top]=value; 
printf("%d pushed into stack \n",value); 
} 
//pop function 
int pop() 
{ if (top==-1) //not 0 because in stack top should be -1 for the stack to be empty 
	{ printf("underflow");
	 return -1; } 
	top--; 
	stack[top]=value; 
	printf("%d popped into stack \n",value); 
} 
int main() 
{ push(10); 
push(20);
 push(30);
 printf("Popped: %d\n", pop()); 
printf("Popped: %d\n", pop()); 
return 0; }
