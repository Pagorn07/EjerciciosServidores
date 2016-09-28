package Practica3;

public class AnyDeTrespas extends Data{
    boolean isAnyDeTrespas() {
        if(getAny() % 2 == 0) return true;
        return false;
    }
}
