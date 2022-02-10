import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyButton extends JLabel implements MouseListener
{
    private Color clr;
    private int difference;
    private Color prsclr;
    private Color hvrclr;
    private static Font cstfont = new Font("Rockwell", Font.BOLD, 11);

    private MyButton(String text)
    {
        super(text);
        setFont(cstfont);
        setForeground(Color.WHITE);
        
        setHorizontalAlignment(SwingConstants.CENTER);
        setOpaque(true);
        clr = new Color(200, 200, 200);
        difference = 25;
        prsclr = new MyColor(clr.getRed()-difference, clr.getGreen()-difference, clr.getBlue()-difference);
        hvrclr = new MyColor(clr.getRed()+difference/2, clr.getGreen()+difference/2, clr.getBlue()+difference/2);

        setBackground(clr);
        setBorder((new MyBorder()).border);
        addMouseListener(this);
        
    }
    private MyButton(String text, Color c1, int diff) //Constructor for a button that takes text, a color object and a difference in color
    {
        this(text);
        clr = c1;
        difference = diff;
        prsclr = new MyColor(clr.getRed()-difference, clr.getGreen()-difference, clr.getBlue()-difference);
        hvrclr = new MyColor(clr.getRed()+difference/2, clr.getGreen()+difference/2, clr.getBlue()+difference/2);
        setBackground(clr);
        addMouseListener(this);
    }
    public MyButton(String text, int r, int g, int b, int difference)
    {
        this(text, new MyColor(r, g, b), difference);
        addMouseListener(this);
    }
    public MyButton(String text, int r, int g, int b)
    {
        this(text, new MyColor(r, g, b), 0);
        addMouseListener(this);
    }



    public void mouseClicked(MouseEvent e)
    {
    }
    public void mousePressed(MouseEvent e)
    {
        this.setBackground(prsclr);
    }
    public void mouseEntered(MouseEvent e)
    {
        this.setBackground(hvrclr);
    }
    public void mouseReleased(MouseEvent e)
    {
        this.setBackground(clr);
    }
    public void mouseExited(MouseEvent e)
    {
        this.setBackground(clr);
    }

}