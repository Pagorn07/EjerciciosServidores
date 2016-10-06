package PrimeraPractica;

import java.awt.*;
import java.util.Scanner;

public class Main {
    private static String optionType = "";
    private static String text = "";
    private static boolean fillColor = false;
    private static int squareSize = 0;
    private static Scanner sc = new Scanner(System.in);

    static void menu() {
        String answer = "";

        System.out.print("Quina figura vols dibuixar (escull una lletra)?\n\n" +
                "    A. Text\n" +
                "    B. Punt\n" +
                "    C. Línia\n" +
                "    D. Cercle\n" +
                "    E. Quadrat\n" +
                "    F. Rectangle\n" +
                "    G. Poligon\n\n" +
                "    H. Dibuixar l'històric de figures\n" +
                "    I. Sortir\n\n" +
                "--> ");

        answer = sc.nextLine();

        switch (answer) {
            case "A":
                showText();
                break;
            case "B":
                showPoint();
                break;
            case "C":
                break;
            case "D":
                break;
            case "E":
                showSquare();
                break;
            case "F":
                break;
            case "G":
                break;
            case "H":
                break;
            case "I":
                break;
            default:
                menu();

        }
    }

    static void callWindow() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GraficWindow frame = new GraficWindow();
                    frame.setOptionType(optionType);
                    frame.setText(text);
                    frame.setSquareSize(squareSize);
                    frame.setFillColor(fillColor);
                    frame.setVisible(true);
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    static void showText() {
        optionType = "string";
        System.out.print("Escribe un texto --> ");
        text = sc.nextLine();
        callWindow();
    }

    static void showPoint() {
        callWindow();
    }

    static void showSquare() {
        optionType = "square";
        System.out.print("De que dimension quieres que sea el cuadrado? --> ");
        squareSize = sc.nextInt();
        System.out.print("Lo quieres relleno de color?(S | N) --> ");
        if(sc.next().equals("S")) fillColor = true;
        else fillColor = false;
        callWindow();
    }

    public static void main(String[] args) {
        menu();

    }
}
