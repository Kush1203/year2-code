//abstract class bike is created

abstract class Bike
{
Bike()
{System.out.println("bike created");}
abstract void run();
void changeGear()
{System.out.println("gear changed");}
}
//subclass 1
class Honda extends Bike{
//method
void run()
{System.out.println("running safely..");}
}


class TestAbstraction2
{
public static void main(String args[])
{
Bike obj=new Honda();
obj.run();
obj.changeGear();
}
}


