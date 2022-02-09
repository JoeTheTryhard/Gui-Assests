import javax.swing.*;
import java.awt.*;

public class Window extends JFrame
{
    public Window()
    {
        super("App Name Here");
        this.setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new MyButton("Click", 200, 200, 200, 25));
        panel.add(new MyButton("Bruh", 200, 200, 200, 0));
        
        this.add(panel, BorderLayout.NORTH);

        this.setSize(1280,720);
        this.setVisible(true); //This has to be last in code. It "renders" everything that is save in the frame
    }

}