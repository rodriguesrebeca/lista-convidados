package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//  Escreva um programa que lê o nome de 5 pessoas e armazena numa lista de convidados.
        //  Ao final, informe qual o nome mais longo presente na lista.
        Scanner scan = new Scanner(System.in);
        String[] pessoas = new String[5];
        System.out.println("Digite o nome de 5 convidados: ");
        for (int i=0; i < pessoas.length; i++){
            pessoas[i] = scan.next();
        }

        String maiorNome = "";
        System.out.println("***** LISTA DE CONVIDADOS *****");
        for (int i=0; i < pessoas.length; i++){
            System.out.println(pessoas[i]);
        }
        for (int i=0; i < pessoas.length; i++){
            if(maiorNome.length() < pessoas[i].length()){
                maiorNome = pessoas[i];
            }
        }
        System.out.println("O maior número é: " +maiorNome);
    }
}
