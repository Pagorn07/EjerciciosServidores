package Practica4;

/**
 * Created by arbos.pablo on 29/09/16.
 */
public class Estudiant extends CentreEducatiu {
    private String nif;
    private String dataAlta;
    private int edat;

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNif() {
        return nif;
    }

    public void setDataAlta(String dataAlta) {
        this.dataAlta = dataAlta;
    }

    public String getDataAlta() {
        return dataAlta;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public int getEdat() {
        return edat;
    }
}
