public class OverloadingOnOrder 
{
    public void add(int a, float b)
    {
        System.out.println("int & float");
    }
    
    public void add(float a, int b)
    {
        System.out.println("float & int");
    }
    
    public static void main(String[] args)
    {
        OverloadingOnOrder s = new OverloadingOnOrder();
        s.add(2,3.1f);
        s.add(2.6f, 4);
    }
}
