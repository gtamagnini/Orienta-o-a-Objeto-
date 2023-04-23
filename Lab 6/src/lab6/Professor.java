/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author WINDOWS
 */
class Professor extends Agente {
  String escola;

  Professor(String nome, String profissao, String escola) {
    super(nome, profissao);
    this.escola = escola;
  }

  void apresentacao() {
    String mensagem = "Meu nome é " + this.nome + " e eu sou um professor";
    if (this.modo_agente) {
      mensagem += " - AGENTE SMITH";
    }
    System.out.println(mensagem);
  }
}