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
        panel.add(new MyButton("Bruh", 200, 100, 26, 100));
        
        this.add(panel, BorderLayout.NORTH);
        this.add(new MyButton("TEST", 100, 100, 100, 25), BorderLayout.CENTER);

        this.setSize(1280,720);
        this.setVisible(true); //This has to be last in code. It "renders" everything that is save in the frame
    }

}