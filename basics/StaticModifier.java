// Q no. 5

public class StaticModifier 
{
    static int a = 200;
    public static void msg()
    {
        System.out.println("msg-method");
    }
    
    public static void main(String args[])
    {
        System.out.println(a);
        msg();
    }
}
