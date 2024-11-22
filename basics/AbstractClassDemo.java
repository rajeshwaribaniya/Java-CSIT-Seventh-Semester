// Qn 3: WAP to demonstrate abstract class in Java

abstract public class AbstractClassDemo 
{
    abstract public void m(); 
    public void n()
    {
        System.out.println("Hello I am n");
    }
}

class XYZ extends AbstractClassDemo
{
    public void m()
    {
        System.out.println("Hello I am m");
    }
    
    public static void main(String args[])
    {
        XYZ a = new XYZ();
        a.m();
        a.n();
    }
}


