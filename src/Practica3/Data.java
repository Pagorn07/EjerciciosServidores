package Practica3;

public class Data {

    //#1
    private static final String SEPARADOR = "-";
    //private String data;
    private int dia;
    private int mes;
    private int any;

    public String getData() {
        //return data;
        return dia + SEPARADOR + mes + SEPARADOR + any;
    }

    public void setData(String data) throws Exception {
        //#2
        if (!data.contains(SEPARADOR)) throw new Exception();
        //this.data = data;
        int[] dates = descomposaData(data);

        this.dia = dates[0];
        this.mes = dates[1];
        this.any = dates[2];
    }

    public int getAny(){
        //return data != null ? descomposaData()[2] : 0;
        return this.any;
    }

    private int[] descomposaData(String data){

        String[] dataDescomposada = data.split(SEPARADOR);
        int[] dataDescomposadaInt = new int[dataDescomposada.length];
        dataDescomposadaInt[0] = Integer.parseInt(dataDescomposada[0]);
        dataDescomposadaInt[1] = Integer.parseInt(dataDescomposada[1]);
        dataDescomposadaInt[2] = Integer.parseInt(dataDescomposada[2]);

        return dataDescomposadaInt;

    }
}