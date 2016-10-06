package PrimeraPractica;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class GraficWindow extends JFrame{
    private JPanel contentPane;
    private String type = "";

    public GraficWindow(String type) {
        this.type = type;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setBounds(0, 0, 800, 600);

    }

    public void paint(Graphics g) {
        super.paint(g);

        if(type.equals("text")) {
            g.drawString("hola", 10, 200);
        }

    }

}
