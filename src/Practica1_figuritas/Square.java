package Practica1_figuritas;

public class Square extends Figura {
    private int longitude;
    private boolean isFilled;

    public int getLongitude() {
        return longitude;
    }

    @Override
    void read() {
        super.read();

        System.out.print("Cuanto mide un lado del cuadrado? (px) --> ");
        longitude = sc.nextInt();
        System.out.print("Lo quieres relleno de color? (Y | N) --> ");
        isFilled = sc.next().equals("Y");



    }
}
