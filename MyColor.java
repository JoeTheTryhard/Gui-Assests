import java.awt.*;

public class MyColor extends Color
{
    private Color clr;
    private static int cRange(int value)
    {
        if (value < 0)
            return 0;
        else if (value > 255)
            return 255;
        else
            return value;
    }
    public MyColor(int r, int g, int b)
    {
        super(cRange(r), cRange(g), cRange(b));
    }
}