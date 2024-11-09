public class OverloadingOnType 
{
    public void add(int a)
    {
        System.out.println(a);
    }
    
    public void add(char c)
    {
        System.out.println(c);
    }
    
    public static void main(String[] args)
    {
        OverloadingOnType s = new OverloadingOnType();
        s.add(2);
        s.add('r');
    }
}
