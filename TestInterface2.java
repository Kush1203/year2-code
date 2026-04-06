interface Bank
{
float RateOfInterest();
}

class SBI implements Bank
{
public float RateOfInterest()
{return 9.15f;}
}

class PNB implements Bank 
{
public float RateOfInterest()
{return 9.7f;}
}


class TestInterface2
{
public static void main(String args[])
{
Bank b=new SBI();
System.out.println("ROI: " +b.RateOfInterest());
Bank c=new PNB();
System.out.println("ROI: " +c.RateOfInterest());  
}}
