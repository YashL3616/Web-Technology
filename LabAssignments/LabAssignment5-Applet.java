import javax.swing.*;

public class Applet5 extends JFrame
{
    public static void main(String[] args) {
        new Applet5();
    }
    public Applet5()
    {
        JLabel label = new JLabel("This is simple message");
        add(label);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
