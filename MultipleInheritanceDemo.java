interface A
{
default void methodA()
{
System.out.println("Method A from interface A");
}
}

interface B
{
default void methodB()
{
System.out.println("Method B from interface B");
}
}

class MyClass implements A,B
{
public void myMethod()
{
System.out.println("My method is MyClass");
}
}

public class MultipleInheritanceDemo
{
public static void main(String args[])
{
MyClass obj=new MyClass();
obj.methodA();
obj.methodB();
obj.myMethod();
}
}
