public class OverloadingOnNumber 
{
    public void add(int a)
    {
        System.out.println(a);
    }
    
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
    
    public static void main(String args[])
    {
        OverloadingOnNumber s=new OverloadingOnNumber();
        s.add(2);
        s.add(2,4);
    }
}