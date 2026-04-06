class FinallyExample
{
public static void main(String args[])
{
int[] n={1,2,3,4,5,6};
try
	{ System.out.println(n[5]);
	}
catch(ArrayIndexOutOfBoundsException e)
	{ System.out.println("exception caught: "+e);
	}
finally { System.out.println("this block alwats executes");
	}
System.out.println("program continues");
}
}
