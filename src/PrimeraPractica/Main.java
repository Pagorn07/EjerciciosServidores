package PrimeraPractica;

import java.awt.*;
import java.util.Scanner;

public class Main {
    private static String optionType = "";
    private static String text = "";
    private static String answerColor = "";
    private static boolean fillColor = false;
    private static int width = 0;
    private static int height = 0;
    private static int posX = 0;
    private static int posY = 0;
    private static Scanner sc = new Scanner(System.in);

    static void menu() {
        String answer;

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
                showRect();
                break;
            case "G":
                break;
            case "H":
                break;
            case "I":
                return;

        }

        menu();
    }

    static void callWindow() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GraficWindow frame = new GraficWindow();
                    frame.setOptionType(optionType);
                    frame.setText(text);
                    frame.setPosX(posX);
                    frame.setPosY(posY);
                    frame.setWidth(width);
                    frame.setHeigth(height);
                    frame.setFillColor(fillColor);
                    frame.setAnswerColor(answerColor);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    static void showText() {
        optionType = "string";
        System.out.print("Escribe un texto --> ");
        text = sc.nextLine();
        System.out.print("Posicion X del texto --> ");
        posX = sc.nextInt();
        System.out.print("Posicion Y del texto --> ");
        posY = sc.nextInt();
        System.out.print("De que color lo quieres? (Rojo | Azul | Verde) --> ");
        answerColor = sc.next();
        callWindow();
    }

    static void showPoint() {
        callWindow();
    }

    static void showSquare() {
        optionType = "square";
        System.out.print("De que dimension quieres que sea el cuadrado? --> ");
        width = sc.nextInt();
        height = width;
        System.out.print("Posicion X del cuadrado --> ");
        posX = sc.nextInt();
        System.out.print("Posicion Y del cuadrado --> ");
        posY = sc.nextInt();
        System.out.print("Lo quieres relleno de color?(S | N) --> ");
        if(fillColor = sc.next().equals("S")) {
            System.out.print("De que color lo quieres? (Rojo | Azul | Verde) --> ");
            answerColor = sc.next();
        }
        callWindow();
    }

    static void showRect() {
        optionType = "rect";
        System.out.print("Define el ancho del rectangulo --> ");
        width = sc.nextInt();
        System.out.print("Define el alto del rectangulo --> ");
        height = sc.nextInt();
        System.out.print("Posicion X del rectangulo --> ");
        posX = sc.nextInt();
        System.out.print("Posicion Y del rectangulo --> ");
        posY = sc.nextInt();
        System.out.print("Lo quieres relleno de color?(S | N) --> ");
        if(fillColor = sc.next().equals("S")) {
            System.out.print("De que color lo quieres? (Rojo | Azul | Verde) --> ");
            answerColor = sc.next();
        }
        callWindow();
    }

    public static void main(String[] args) {
        menu();
    }
}
