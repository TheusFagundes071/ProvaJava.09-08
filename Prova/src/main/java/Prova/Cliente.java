/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Cliente extends Fisica{
    private int protocoloAtendimento;
    
    //CONSTRUTOR

    public Cliente(int protocoloAtendimento, LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(dataNascimento, genero, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }
    
    //GETTER E SETTER

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }
    
    //TO STRING

    @Override
    public String toString() {
        return super.toString() + 
                "\n Protocolo de atendimento=" + protocoloAtendimento;
    }
    
    
}
