class Demo
{
void show()
{	System.out.println("i am in show method of super class");	}
}

class FlaDemo
{
//beginning of anonymous class
static Demo d=new Demo()
{
void show()
{	super.show();
System.out.println("i am in flavor1Demo class");
}
//end of anonymous class
};


public static void main(String args[])
{
d.show();
}

}
