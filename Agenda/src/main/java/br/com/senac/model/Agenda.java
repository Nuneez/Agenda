/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.model;

import java.util.Scanner;

/**
 *
 * @author Nuneez
 */
public class Agenda {

    public static void main(String[] args) {
        Services Agenda = new Services();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem Vindo !");
        System.out.println();
        System.out.println("Agenda AKP - Versão 1.0");
        System.out.println();
        
        do {
            System.out.println("~~~~~~ DIGITE UMA OPÇÃO ~~~~~~~~");
            System.out.println("(1) Listar agenda");
            System.out.println("(2) Incluir registro");
            System.out.println("(0) SAIR");
            System.out.print("Opção: ");
            int opcao = entrada.nextInt();

            if (opcao == 1) {
                Agenda.listarPessoas();
            } else if (opcao == 2) {
                Agenda.incluirPessoa();
            } else if (opcao == 0) {
                System.exit(0);
            } else {
                System.out.println("OPÇÃO INVÁLIDA.");
            }

        } while (true);
    }
}
