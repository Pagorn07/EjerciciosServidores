package Practica1_figuritas;

public class Line extends Figura{
    private int finX;
    private int finY;

    public int getFinX() {
        return finX;
    }

    public int getFinY() {
        return finY;
    }

    @Override
    void read() {
        super.read();

        System.out.print("Define la posición de X destino --> ");
        sc.nextInt();
        System.out.print("Define la posición de Y destino --> ");
        sc.nextInt();
    }
}