package Gerenciamento;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int Id;
    private String Nome;
    private int Telefone;

    public Cliente(int id, int telefone, String nome){
        Id = id;
        Telefone = telefone;
        Nome = nome;
    }

    public void Alugar(int id){
    }
    public void devolver(){

    }
//===================================================================================
    public int getId() {return Id;}

    public void setId(int id) {this.Id = id;}

    public String getNome() {return Nome;}

    public void setNome(String nome) {this.Nome = nome;}

    public int getTelefone() {return Telefone;}

    public void setTelefone(int telefone) {this.Telefone = telefone;}
}
