/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author WINDOWS
 */

    class Empresario extends Agente {
  String empresa;

  Empresario(String nome, String profissao, String empresa) {
    super(nome, profissao);
    this.empresa = empresa;
  }

  void apresentacao() {
    String mensagem = "Meu nome é " + this.nome + " e eu sou um empresário";
    if (this.modo_agente) {
      mensagem += " - AGENTE SMITH";
    }
    System.out.println(mensagem);
  }
}

    

