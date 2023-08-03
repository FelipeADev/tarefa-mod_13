package br.com.faguirre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        registro();
    }

    public static void registro (){
        Scanner s = new Scanner(System.in);
        System.out.println("Você é uma pessoa física ou jurídica?");
        System.out.println("Responda 1 para física ou 2 para jurídica: ");
        String resposta = String.valueOf(s.next());

        if(resposta.equalsIgnoreCase("1")){
            PessoaFisica fisica = new PessoaFisica();

            System.out.println("Digite seu nome: ");
            fisica.setNome(s.next());
            System.out.println("Digite seu sobrenome: ");
            fisica.setSobrenome(s.next());
            System.out.println("Digite seu CPF: ");
            fisica.setCPF(s.next());

            System.out.println("Nome: " + fisica.getNome() + " " + fisica.getSobrenome() + " CPF: " + fisica.getCPF());
        } else if (resposta.equalsIgnoreCase("2")) {
            PessoaJuridica juridica = new PessoaJuridica();

            System.out.println("Digite seu nome: ");
            juridica.setNome(s.next());
            System.out.println("Digite seu sobrenome: ");
            juridica.setSobrenome(s.next());
            System.out.println("Digite seu CNPJ: ");
            juridica.setCNPJ(s.next());

            System.out.println("Nome: " + juridica.getNome() + " " + juridica.getSobrenome() + " CNPJ: " + juridica.getCNPJ());
        }
    }
}