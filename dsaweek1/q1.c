#include <stdio.h>
#include <stdlib.h> //when you use this u can use exit(1) which forces exit from a loop which helps handles errors
#define MAX 100

struct Stu 
{
char id[50];
char name[100];
char dob[20];
float cgpa;
};  //syntac for struct

//copy pasted from stack.c code
//creating push and pop function
//make stack structure first
//student stack

struct Stu stack[MAX];
int top = -1; //empty stack has top=-1

//initiate s
//push function

void push(struct Stu s)
{ if (top==MAX-1)
        { printf("overflow");
        return;
}
stack[++top]=s;
}

//pop function
struct Stu pop()
{
struct Stu temp;
if (top==-1) //not 0 because in stack top should be -1 for the stack to be empty
        { printf("underflow");
         exit(1); }
       temp=stack[top--];
       return temp;
}

int main()
{
FILE *fp; //using only 1 pointer instead of 2
struct Stu s;
fp=fopen("studentin.dat","r");
if(fp==NULL)
{
printf("error opening input file \n");
return 1;
}
while(fscanf(fp,"%s %s %s %f",s.id,s.name,s.dob,&s.cgpa)!=EOF) {
push(s);
}
//EOF

fclose(fp);
fp=fopen("studenout.dat","w"); //w=write
if(fp==NULL)
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

