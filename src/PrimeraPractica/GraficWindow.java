package PrimeraPractica;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class GraficWindow extends JFrame{
    private JPanel contentPane;
    private String optionType = "";
    private String text = "";
    private boolean fillColor = false;
    private int squareSize = 0;

    public String getOptionType() {
        return optionType;
    }

    public void setOptionType(String optionType) {
        this.optionType = optionType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setSquareSize(int squareSize) {
        this.squareSize = squareSize;
    }

    public int getSquareSize() {
        return squareSize;
    }

    public void setFillColor(boolean fillColor) {
        this.fillColor = fillColor;
    }

    public GraficWindow() {
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

        g.setColor(Color.blue);

        if(optionType.equals("string")) {
            g.drawString(text, 10, 200);
        } else if(optionType.equals("square")) {
            if (fillColor) {
                g.fillRect(100, 100, squareSize, squareSize);
            } else {
                g.setColor(Color.magenta);
                g.drawRect(100, 100, squareSize, squareSize);
            }
        }
    }

}
