/* Hierarchical Inheritance example program in Java */
// Source : http://beginnersbook.com/2013/10/hierarchical-inheritance-java-program/

Class A
{
  public void methodA()
  {
     System.out.println("method of Class A");
  }
}
Class B extends A
{
  public void methodB()
  {
     System.out.println("method of Class B");
  }
}
Class C extends A
{
 public void methodC()
 {
 System.out.println("method of Class C");
 }
}
Class D extends A
{
  public void methodD()
  {
     System.out.println("method of Class D");
  }
}
Class MyClass
{
  public void methodB()
  {
     System.out.println("method of Class B");
  }
  public static void main(String args[])
  {
     B obj1 = new B();
     C obj2 = new C();
     D obj3 = new D();
     obj1.methodA();
     obj2.methodA();
     obj3.methodA();
  }
}
