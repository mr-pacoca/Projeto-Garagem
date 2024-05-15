import Gerenciamento.Garagem;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       Garagem g = new Garagem();
       Scanner entrada = new Scanner(System.in);

       while(true){
           System.out.println("Menu");
           System.out.println("Adicionar novo carro");
           System.out.println("Buscar carro");
           System.out.println("Atualizar carro");
           System.out.println("Remover carro");
           System.out.println("Adicionar novo cliente");
           System.out.println("Buscar cliente");
           System.out.println("Atualizar cliente");
           System.out.println("Remover cliente");
           System.out.println("Disponibidade de carro");
           System.out.println("sair");
           int opcao = entrada.nextInt();
           entrada.nextLine();


           switch (opcao){
               case 1:
                   System.out.println("Adicionar carro");
                   System.out.println("Marca: ");
                   String marcaCarro = entrada.nextLine();
                   System.out.println("Modelo");
                   String modeloCarro = entrada.nextLine();

           }
       }
    }
}
