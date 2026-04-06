import java.util.*;
void 
{
String firstName;
String lastName;

public emp(String first,String last)
{ this.firstName=first;
 this.lastName=last;
}

public String toString()
{ return"("+lastName+","+firstName+")"; }


@Override
public int compareTo(Emp value)
{
if(this.lastName.
