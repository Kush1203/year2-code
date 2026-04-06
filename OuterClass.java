public class Outerclass
{

	//instance method
void my_Method()
{
int num=23;
	//method local inner class
class MethodInner_Demo
{
public void print()
{
System.out.println("This is method inner class "+num);
}
}
MethodInner_Demo inner=new MethodInner_Demo();
inner.print();
}
public static void main(String args[])
{
Outerclass outer=new Outerclass();
outer.my_Method();
}


}

