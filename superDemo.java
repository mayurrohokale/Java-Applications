class Base
{
    public int A;

    public Base()
    {
        System.out.println("Inside Base Default Construcctor");
        this.A = 11;
    }

    public Base(int i)
    {
        System.out.println("Inside Base  Parameterised Construcctor");
        this.A = i;
    }

    public void fun()
    {
        System.out.println("Inside Base fun");
    }
}

class Derived extends Base    //class  Derived : public Base
{
    public int X;


    public Derived()
    {
        super(11);              //3
        System.out.println("Inside Derived Construcctor");
        this.X = 51;
    }
    public void gun()
    {
        System.out.println("Inside Derived gun");
        System.out.println("Value of A : "+super.A);  //1
        super.fun(); //2
        
    }
}

class superDemo
{
    public static void main(String Arg[])
    {
    
        Derived dobj = new Derived();   // No casting
    
        dobj.gun();
        
        System.out.println(dobj.A);

        System.out.println(dobj.X);


    }
}
      //  1. Access Data of Parent class from child class
      //  2. call method of parent from child
      //  3. call constructor of parent from child 