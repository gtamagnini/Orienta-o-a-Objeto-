/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

class Advogado extends Agente {
  String OAB;

  Advogado(String nome, String profissao, String OAB) {
    super(nome, profissao);
    this.OAB = OAB;
  }

  void apresentacao() {
    String mensagem = "Meu nome é " + this.nome + " e eu sou um advogado";
    if (this.modo_agente) {
      mensagem += " - AGENTE SMITH";
    }
    System.out.println(mensagem);
  }
}
