class LinearEquation
{
double a,b,c,d,e,f;
private double x,y;
public LinearEquation(double a,double b,double c,double d,double e,double f)
{
this.a=a;
this.b=b;
this.c=c;
this.d=d;
this.e=e;
this.f=f;
}
public boolean isSolvable()
  {return(a*d-b*c!=0);}
public void solve()
{ if(!isSolvable()) return;
  double den=(a*d-b*c);
	x=(e*d-b*f)/den;
	y=(a*f-e*c)/den; }
}

class Line
{
private double x1,y1,x2,y2;
private Line(double x1,double y1,double x2,double y2)
{ this.x1=x1;
  this.y1=y1;
  this.x1=x1;
  this.y1=y1;
}
public void intersectingPoints(Line anotherLine)
{
double l1_a=y1-y2;
double l1_b=x1-x2;
double l1_e = x2*y1 - x1*y2;

double l2_c=anotherLine.y1-anotherLine.y2;
double l2_d = anotherLine.x2 - anotherLine.x1;
double l2_f = anotherLine.x2*anotherLine.y1 - anotherLine.x1*anotherLine.y2;

LinearEquation k=new LinearEquation(l1_a,l1_b,l1_e,l2_c,l2_d,l2_f);
k.solve();
}
}

 public class t4q1{
public static void main(String[] args) {
 double x1, y1, x2, y2, x3, y3, x4, y4;
 Line l1 = new Line(x1, y1, x2, y2); //line (x1, y1) – (x2, y2)
 Line l2 = new Line(x3, y3, x4, y4); //line (x3, y3) – (x4, y4)
 l1.intersctingPoints(l2);
}
 }
