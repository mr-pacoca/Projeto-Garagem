package Gerenciamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Garagem{
    private boolean disponivel;
    private List<Carro> carros;
    private List<Cliente> clientes;

    public Garagem() {
        carros = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    public void adiocionarCarro(Carro carro){
        carros.add(carro);
    }

    public Carro buscarCarro(int id){
        for(Carro carro: carros){
            if(carro.getId() == id){
                return carro;
            }
        }
        return null;
    }
    public void AtualizarCarro(int id, String novoModelo,
                               String novaMarca,
                               int mudancaAno){
        for (Carro carro: carros){
            if(carro.getId() == id ){
                carro.setModelo(novoModelo);
                carro.setMarca(novaMarca);
                carro.getAno_frabr(mudancaAno);
            }
        }
    }
    public void removerCarro(int id){
        for (Carro carro: carros){
            if(carro.getId() == id){
                carros.remove(carro);
            }
        }

    }
    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public Cliente buscarCliente(int id){
        for(Cliente cliente: clientes){
            if(cliente.getId() == id){
                return cliente;
            }
        }
        return null;
    }
    public void atualizarCliente(int id,
                                 String novoNome,
                                 int novoTele){
        for(Cliente cliente: clientes){
            if(cliente.getId() == id){
                cliente.setNome(novoNome);
                cliente.setTelefone(novoTele);
            }
        }
    }
    public void removerCliente(int id){
        for(Cliente cliente: clientes){
            if(cliente.getId() == id){
                clientes.remove(cliente);
            }
        }
    }
    public void disponibilidade(int id){
        for(Carro carro: carros){
            if(carro.getId() == id){
                if (carros.contains(true)){
                    System.out.println("Carro disponivel para aluguel!");
                }
            }
        }
    }
    public void alugar(int id){
        for(Carro carro: carros){
            if(carro.getId() == id){

            }
        }
    }

    //===================================================================
    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}

