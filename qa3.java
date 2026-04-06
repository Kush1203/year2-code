class qa3
{
public static void main(String args[])
{
int a[]={3,9,8,2,0,3,-5,1};
for(int a:a){
System.out.print(a);
}
float array2[]=new float[a.length];
int i=0;
while(i<a.length && a[i]>0)
{ array2[i]=(float)a[i];
i++;
}
for(float b:array2) 
{System.out.print(b);} }}
