import java.awt.*;
import java.awt.event.*;

public class ShortHand 
{
    public static void main(String arg[])
    {
        Frame fobj = new Frame("Marvellous");
        fobj.setSize(500, 500);
        fobj.setVisible(true);

        Button bobj = new Button("Ok");
        fobj.add(bobj);
        //Annonymous Inner Class
        bobj.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent aobj)
            {
                System.out.println("Button Pressed");
            }
         });

    }
}
