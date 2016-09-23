package Practica2;

public class GarbageColl {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Me he ejecutado :D");

    }

    public static void main(String[] args) throws Throwable {
        GarbageColl gc = new GarbageColl();
        gc = null;
        System.gc();

    }
}
