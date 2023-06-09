/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Prova;

/**
 *
 * @author Aluno
 */
public enum Setor {
        ENGENHARIA("Engenharia"),
        SAUDE("Saúde"),
        JURIDICO("Jurídico"),
        OPERACOES("Operações");
        
        protected String nome;
        
        //CONSTRUTOR

    private Setor(String nome) {
        this.nome = nome;
    }
        
    //getter

    public String getNome() {
        return nome;
    }
    
}
