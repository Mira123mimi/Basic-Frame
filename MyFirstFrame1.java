
package za.ac.tut.ui;

import java.awt.Color;
import javax.swing.JFrame;

public class MyFirstFrame1 extends JFrame
{
    public MyFirstFrame1()
    {
        setTitle("My First GUI");
        setSize(200, 250);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.BLUE);
        setVisible(true);
    }
}
