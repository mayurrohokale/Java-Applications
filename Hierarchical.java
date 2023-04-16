class Base
{
    public int A;
    public int B;

    public Base()
    {
        System.out.println("Inside Base Construcctor");
        this.A = 11;
        this.B = 21;
    }

    public void fun()
    {
        System.out.println("Inside Base fun");
    }
}

class Derived extends Base    //class  Derived : public Base
{
    public int X;
    public int Y;

    public Derived()
    {
        System.out.println("Inside Derived Construcctor");
        this.X = 51;
        this.Y = 101;
    }
    public void gun()
    {
        System.out.println("Inside Derived gun");
    }
}

class DerivedX extends Base       //class DerivedX : public Derived
{
    public int Z;

    public DerivedX()
    {
        System.out.println("Inside DerivedX Construcctor");
        this.Z = 111;
    }
}

class Hierarchical
{
    public static void main(String Arg[])
    {
    
        DerivedX dobj = new DerivedX();   // No casting
        dobj.fun();

        System.out.println(dobj.A);
        System.out.println(dobj.B);
        System.out.println(dobj.Z);

    }
}
      //  Base bobj = new Base();         // No casting
     //   Derived dobj = new Derived();   // No casting
    //    Base bobj2 = new Derived();      // Upcasting - Not allowed
   //     Derived dobj2 = new Base();      //Down Casting