package Incapsulamento;

public class Auto {
    private int cilindrata;
    private String targa, marca, modello;

    public Auto(int cilindrata, String targa, String marca, String modello) {
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }
}