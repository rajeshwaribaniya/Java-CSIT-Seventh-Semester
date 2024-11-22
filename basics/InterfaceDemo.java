public interface InterfaceDemo 
{
    int Max = 800;
    public void show();
}

class ABC implements InterfaceDemo
{
    public void show()
    {
        System.out.println(Max);
    }
    
    public static void main(String[] args)
    {
            ABC a = new ABC();
            a.show();
    }
}
