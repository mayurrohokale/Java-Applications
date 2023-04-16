
abstract class RBI
{
    public abstract float CalculateROI();
    // virtual float CalculateROI() = 0;
    public void DisplayRules()
    {
        System.out.println("You have to submit Adhar card and PAN card");
        System.out.println("Minimum Balance is 10,000");
    }
}

class SBI extends RBI
{   
    public float CalculateROI()
    {
        return 5.7f;
    }

}

class BOM extends RBI
{

    public float CalculateROI()
    {
        return 7.7f;
    }

}

class AbstractDemo 
{
    public static void main(String Arg[])
    {
        SBI sobj = new SBI();
        BOM bobj = new BOM();

        sobj.DisplayRules();
        bobj.DisplayRules();

        float dRet = 0.0f;

        dRet = sobj.CalculateROI();
        System.out.println("ROI of SBI is : "+dRet);

        dRet = bobj.CalculateROI();
        System.out.println("ROI of BOM is : "+dRet);

    }    
}
