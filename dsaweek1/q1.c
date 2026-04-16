#include <stdio.h>
#include <stdlib.h> //when you use this u can use exit(1) which forces exit from a loop which helps handles errors
#define MAX 100

struct STU {
char id[50];
char name[100];
char dob[20];
float cgpa;
};  //syntac for struct

//copy pasted from stack.c code

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
{
FILE *fp //using only 1 pointer instead of 2
strct Stu s;
fp=fopen("studentin.dat","r");
if(fp==NULL)
{
printf("error opening input file \n");
return 1;
}
while(fscaf(fp,"%s %s %s %f",s.id,s.name,s.dob,&s.cgpa)!=EOF) {
push(s);
}
//EOF

fclose(fp);
fp=fopen("studenout.dat","w"); //w=write
if(fp=NULL)
{printf("error opening input file \n");
return 1;
}
printf("\nID\t\tNAME\tDOB\t\tCGPA\n");
printf("________________________________________________\n");

//MAIN LOGIC
while(top!=-1)
{
s=pop();
printf("%s\t %s\t %s\t %0.2f\n",s.id,s.name,s.dob,s.cgpa);
}
fclose(fp);
return 0;
}
