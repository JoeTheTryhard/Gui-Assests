import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class MyBorder
{
    Border border;
    public MyBorder()
    {
        border = BorderFactory.createEmptyBorder(5, 5, 5, 5); //The integers are the width of the top, left, bottom and right sides respectively
    }
}
