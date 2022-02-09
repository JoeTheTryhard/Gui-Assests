import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

class MyButton extends JButton
{
    Color clr = new Color(200, 200, 200);
    Color prsclr = new Color(clr.getRed()-25, clr.getGreen()-25, clr.getBlue()-25);
    public MyButton(String text)
    {
        super(text);
        setBackground(clr);
        setFocusPainted(false);
        setBorder((new MyBorder()).border);
    }
    public void actionPerformed(ActionEvent e)
    {
        System.out.println(e);
    }
}