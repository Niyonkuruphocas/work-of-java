
class gg
{
 
    public static void main (String[] args)
    {
        Main tt = new Main();
        tt.show();
    }
}
interface Test
{
    final int name = "test interface";
    default void show()
    {
        System.out.println("showing test interface");
    }
}
  
