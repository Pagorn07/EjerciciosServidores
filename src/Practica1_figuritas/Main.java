package Practica1_figuritas;

import java.awt.*;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static Figura figura;

    static void menu() {
        String answer;

        System.out.println("A. Texto\n" +
                "B. Punto\n" +
                "C. Linea\n" +
                "D. Círculo\n" +
                "E. Cuadrado\n" +
                "F. Rectángulo\n" +
                "G. Polígono\n\n" +
                "H. Dibujar el historial de figuras\n" +
                "I. Salir");

        System.out.print("Elige --> ");
        answer = sc.nextLine();

        switch (answer) {
            case "A":
                //createText();
                break;
            case "B":
                //createPoint();
                break;
            case "C":
                //createLine();
                break;
            case "D":
                //createCircle();
                break;
            case "E":
                figura = new Square();
                figura.read();

                callWindow();
                break;
            case "F":
                //createRect();
                break;
            case "G":
                //createPoligon();
                break;
            case "H":
                //showHistory();
                break;
            case "I":
                return;

        }

        menu();

    }

    static void callWindow() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Window frame = new Window();
                    frame.setVisible(true);
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        menu();
    }

}