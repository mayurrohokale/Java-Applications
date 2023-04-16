import java.awt.*;

class MarvellousFrame
{
    public Frame fobj;

    public MarvellousFrame(String title)
    {
        fobj = new Frame(title);
        fobj.setSize(400, 400);
        fobj.setVisible(true);
    }

}

public class GUI3
{
    public static void main(String arg[])
    {
        MarvellousFrame mobj = new MarvellousFrame("PPA");
    }

}
