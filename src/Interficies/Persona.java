package Interficies;

public class Persona {
}

class Alumne {

}

class Docent extends Persona implements Treballador{

    @Override
    public void pagaAlTreballador(Treballador treballador) {

    }
}

class Estudiant extends Alumne{

}

class Becari extends Alumne implements Treballador{

    @Override
    public void pagaAlTreballador(Treballador treballador) {

    }
}

class Primaria extends Docent{

}

class Secundaria extends Docent{

}

interface Treballador {
    void pagaAlTreballador(Treballador treballador);
}
