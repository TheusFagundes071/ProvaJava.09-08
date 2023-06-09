/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Aluno
 */
public abstract class Fisica extends Pessoa{
    
    protected LocalDate dataNascimento;
    protected Genero genero;
    
    //CONSTRUTOR

    public Fisica(LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }
    
    //GETTER E SETTER

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    //IDADE
    public int getIdade(){
        return Period.between(dataNascimento,LocalDate.now()).getYears();
    }
    
    
    //TO STRING

    @Override
    public String toString() {
        return super.toString() 
                +"\n Data Nascimento:" + dataNascimento + 
                "\n Gênero:" + genero.getTexto()+
                "\n Sigla:" +genero.caractere+
                "\n Idade:" +getIdade();
        
    }
    
    
}
