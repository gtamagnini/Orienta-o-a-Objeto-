/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;


abstract class Agente {
  String nome;
  boolean modo_agente;
  String profissao;

  Agente(String nome, String profissao) {
    this.nome = nome;
    this.modo_agente = false;
    this.profissao = profissao;
  }

  abstract void apresentacao();

  void modo_agente_on() {
    this.modo_agente = true;
  }
}

    
