class base
{
    void show()
    {
        System.out.println("hello");
    }
}
class derived extends base
{
    void show()
    {
        System.out.println("world");
    }
    public   void  main(String[] args)
     {
        derived d=new derived();
        d.show();
    }
}