import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends JFrame
{
    JLabel label;
    public MouseEventDemo()
    {
        label=new JLabel("Enter The Frame");
        label.setBounds(100,100,200,200);
        Border border=BorderFactory.createLineBorder(Color.BLACK,2);

        label.setBorder(border);

        label.addMouseListener(
                new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        //System.out.println("You just Clicked me at"+"["+e.getX()+","+e.getY()+"]"); //wrond
                        label.setText("You just Clicked me at"+"["+e.getX()+","+e.getY()+"]");

                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        label.setText("YOu Presed me");
                        getContentPane().setBackground(Color.CYAN);


                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                        label.setText("YOu Released me");
                        getContentPane().setBackground(Color.WHITE);


                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        label.setText("You are at me at"+"["+e.getX()+","+e.getY()+"]");


                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        label.setText("Muzme sama ja");

                    }
                }
        );
        add(label);
        setSize(400,400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

public static void main(String[] args) {
    new MouseEventDemo();
}

}
