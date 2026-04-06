class EncapsulationDemo
{
private int ssn;
private String empName;
private int empAge;

public int getEmpSSN()
{ return ssn; }
public String getEmpName()
{ return empName; }
public int getEmpAge()
{ return empAge; }
public void setEmpAge(int newValue)
{ empAge=newValue; }

public void setEmpName(String newValue)
{ empName=newValue; }
public void setEmpSSN(int newValue)
{ ssn=newValue; }
}

public class EncapsTest
{
public static void main(String args[])
{
EncapsulationDemo obj=new EncapsulationDemo();
obj.setEmpName("kush");
obj.setEmpAge(19);
obj.setEmpSSN(20240280);
System.out.println("employee name: "+obj.getEmpName());
System.out.println("employee SSN: "+obj.getEmpSSN());
System.out.println("employee Age: "+obj.getEmpAge());
}
}
