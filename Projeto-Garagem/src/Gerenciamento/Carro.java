package Gerenciamento;

public class Carro {
    private int Ano_frabr, Id;
    private String Marca, Modelo;

    public Carro(int ano_frabr, int id, String marca, String modelo){
        Ano_frabr = ano_frabr;
        Id = id;
        Marca = marca;
        Modelo = modelo;
    }

    public int getAno_frabr(int mudancaAno) {
        return Ano_frabr;
    }

    public void setAno_frabr(int ano_frabr) {
        Ano_frabr = ano_frabr;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }
}

