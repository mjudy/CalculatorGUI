import javax.swing.*;
import java.awt.*;

public class ExtendedButton extends JButton
{
    public ExtendedButton(String text, ImageIcon icon, Font font)
    {
        this.setFont(font);
        this.setText(text);
        this.setIcon(icon);
        this.setHorizontalTextPosition(SwingConstants.LEFT);
    }
}
