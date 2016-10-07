package PrimeraPractica;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class GraficWindow extends JFrame{
    private JPanel contentPane;
    private String optionType = "";
    private String text = "";
    private String answerColor = "";
    private boolean fillColor = false;
    private int width = 0;
    private int heigth = 0;
    private int posX = 0;
    private int posY = 0;

    //Setters---------------------------------------------------------------

    public void setOptionType(String optionType) {
        this.optionType = optionType;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public void setFillColor(boolean fillColor) {
        this.fillColor = fillColor;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setAnswerColor(String answerColor) {
        this.answerColor = answerColor;
    }

    //---------------------------------------------------------------------------------

    public GraficWindow() {
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

        if(answerColor.equals("Rojo")) {
            g.setColor(Color.red);
        } else if(answerColor.equals("Azul")) {
            g.setColor(Color.blue);
        } else if(answerColor.equals("Verde")) {
            g.setColor(Color.green);
        }

        if(optionType.equals("string")) {
            g.drawString(text, posX, posY);
        } else if(optionType.equals("square") || optionType.equals("rect")) {
            if (fillColor) {
                g.fillRect(posX, posY, width, heigth);
            } else {
                g.drawRect(posX, posY, width, heigth);
            }
        }
    }

}
