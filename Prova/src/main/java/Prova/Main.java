/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Prova;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
       Juridica juridica = new Juridica("1111111111", "1111111", "Matheus", "(11) 1111-1111", "1@gmail.com", new Endereco("Rua 1", "1", "lado 1", "11111-111", "Salvador", UnidadeFederativa.BAHIA));
       Cliente cliente = new Cliente(2, LocalDate.of(2003, Month.MARCH, 6), Genero.FEMININO, "Maria", "(22) 2222-2222", "2@gmail.com", new Endereco("Rua 2", "2", "lado 2", "22222-222", "Bangu", UnidadeFederativa.RIO_DE_JANEIRO));
       Motoboy motoboy = new Motoboy("33333.3333", "3333333333", "333333333", "3333333333", Setor.OPERACOES, 1000, LocalDate.of(2002, Month.MARCH, 6), Genero.MASCULINO, "André", "(33) 33333-3333", "3@gmail.com", new Endereco("Rua 3", "3", "lado 3", "33333-333", "Guarulhos", UnidadeFederativa.SAO_PAULO));
       Medico medico = new Medico("4", "4444444", "4444444", "44444", Setor.SAUDE, 2000, LocalDate.of(2001, Month.MARCH, 6), Genero.FEMININO, "Ana", "(44) 4444-4444", "4@gmail.com", new Endereco("Rua 4", "4", "lado 4", "44444-444", "Salvador", UnidadeFederativa.BAHIA));
       Advogado advogado = new Advogado("5", "55555555", "555555", "5555555", Setor.JURIDICO, 3000, LocalDate.of(2000, Month.MARCH, 6), Genero.MASCULINO, "Daniel", "(55) 5555-5555", "5@hotmail.com", new Endereco("Rua 5", "5", "lado 5", "55555-555", "Camaçari", UnidadeFederativa.BAHIA));
       
       
       
        System.out.println("Jurídico:");
        System.out.println(juridica);
        System.out.println("");
        
        System.out.println("Cliente:");
        System.out.println(cliente);
        System.out.println("");
        
        
        System.out.println("Motoboy:");
        System.out.println(motoboy);
        System.out.println("");
        
        System.out.println("Médico:");
        System.out.println(medico);
        System.out.println("");
        
        System.out.println("Advogado:");
        System.out.println(advogado);
        System.out.println("");
        
        
    }
}
