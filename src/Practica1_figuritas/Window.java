package Practica1_figuritas;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Window extends JFrame {
    private JPanel contentPane;


    public Window() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setBounds(0, 0, 800, 600);
    }

    public void paint(Graphics g) {
        super.paint(g);

        if(Main.figura instanceof Square) {
            Square square = (Square)Main.figura;

            g.drawRect(square.getPosX(), square.getPosY(), square.getLongitude(), square.getLongitude());
        }




    }

}
