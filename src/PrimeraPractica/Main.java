package PrimeraPractica;

import java.awt.*;
import java.util.Scanner;

public class Main {
    static void menu() {
        Scanner sc = new Scanner(System.in);
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
                showText("text");
                break;
            case "B":
                break;
            case "C":
                break;
            case "D":
                break;
            case "E":
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

    static void callWindow(final String text) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GraficWindow frame = new GraficWindow(text);
                    frame.setVisible(true);
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    static void showText(String type) {
        callWindow(type);
    }

    public static void main(String[] args) {
        menu();

    }
}
