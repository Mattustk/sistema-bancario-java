package calculos;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Variáveis//
        float saldo;
        float valor = 0;  
        int opcao = 0;
        saldo = 0;
        
        while (opcao != 4) { //repete enquanto a opção escolhida não for a 4//
            
            // MENU //
            System.out.println("\n=== BANCO ===");  // \n pula linha//
            System.out.println("Escolha uma opção");
            System.out.println("1 Depositar");
            System.out.println("2 Sacar");
            System.out.println("3 Ver Saldo");   
            System.out.println("4 Sair"); 
            System.out.print("Digite sua opção: ");
            
            opcao = scan.nextInt(); //scan para ler a opção selecionada//
            
            if (opcao == 1) {   
                System.out.print("Inserir Valor: ");
                valor = scan.nextFloat(); // Para ler o valor inserido//
                saldo += valor; //soma//
                System.out.println("Depósito Concluído");
                System.out.println("Saldo Atual: R$ " + saldo); //mostra o saldo em conta//
            }
            
            if (opcao == 2) {
                System.out.print("Inserir Valor para saque: ");
                valor = scan.nextFloat();
                
                if (valor > 0) {  //Seleciona apenas números positivos//
                    if (valor <= saldo) {  // Se o valor inserido for maior que o saldo a operação não será concluída// 
                        saldo = saldo - valor;  //Saque//
                        System.out.println("Saque Concluído");
                        System.out.println("Saldo Atual: R$ " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente");
                        System.out.println("Seu saldo: R$ " + saldo);
                    }
                } else {
                    System.out.println("Valor Negativo.");
                }
            }
            
            if (opcao == 3) {   
                System.out.println("Saldo Atual: R$ " + saldo);
            }
            
            if (opcao == 4) {   
                System.out.println("Saindo...");
            }
            
            if (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida! Digite 1, 2, 3 ou 4.");
            }
            
        }   // fim do while (loop)//
        
        System.out.println("Fim do programa"); 
        scan.close(); //finaliza o scan//
        
    }
}