/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author WINDOWS
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Neo, a Matrix é um grande sistema orientado a objetos, em que as pessoas são objetos de classes que herdam da classe abstrata Agente.\n");
        
        ArrayList<Agente> pessoas = new ArrayList<Agente>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Criar empresário");
            System.out.println("2 - Criar professor");
            System.out.println("3 - Criar advogado");
            System.out.println("4 - Apresentar todas as pessoas");
            System.out.println("0 - Sair");
            
            int opcao = scanner.nextInt();
            
            if (opcao == 0) {
                break;
            }
            
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do empresário:");
                    String nomeEmpresario = scanner.next();
                    System.out.println("Digite a empresa do empresário:");
                    String empresa = scanner.next();
                    Empresario empresario = new Empresario(nomeEmpresario, "empresário", empresa);
                    pessoas.add(empresario);
                    break;
                case 2:
                    System.out.println("Digite o nome do professor:");
                    String nomeProfessor = scanner.next();
                    System.out.println("Digite a escola do professor:");
                    String escola = scanner.next();
                    Professor professor = new Professor(nomeProfessor, "professor", escola);
                    pessoas.add(professor);
                    break;
                case 3:
                    System.out.println("Digite o nome do advogado:");
                    String nomeAdvogado = scanner.next();
                    System.out.println("Digite o número da OAB do advogado:");
                    String OAB = scanner.next();
                    Advogado advogado = new Advogado(nomeAdvogado, "advogado", OAB);
                    pessoas.add(advogado);
                    break;
                case 4:
                    for (Agente pessoa : pessoas) {
                        pessoa.apresentacao();
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
        }
    }
    
    System.out.println("Escolha algumas pessoas para se tornarem Agentes (digite o índice da pessoa):");
    for (int i = 0; i < pessoas.size(); i++) {
        System.out.println(i + " - " + pessoas.get(i).nome);
    }
    
    while (true) {
        int opcao = scanner.nextInt();
        
        if (opcao == -1) {
            break;
        }
        
        Agente pessoa = pessoas.get(opcao);
        pessoa.modo_agente_on();
        System.out.println(pessoa.nome + " agora é um Agente.");
    }
    
    scanner.close();
}
}
