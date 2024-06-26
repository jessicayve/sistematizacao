package sistematizacao;

import java.util.Scanner;


class Funcionario {
 private String nome;
 private String alergias;
 private String problemasMedicos;
 private String telefone;
 private String email;


 public Funcionario(String nome, String alergias, String problemasMedicos, String telefone, String email) {
     this.nome = nome;
     this.alergias = alergias;
     this.problemasMedicos = problemasMedicos;
     this.telefone = telefone;
     this.email = email;
 }

 
 public void exibirInformacoes() {
     System.out.println("Nome: " + nome);
     System.out.println("Alergias: " + alergias);
     System.out.println("Problemas Médicos: " + problemasMedicos);
     System.out.println("Telefone: " + telefone);
     System.out.println("Email: " + email);
 }
}


public class sistematizacao {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     
     System.out.println("Digite o nome do funcionário:");
     String nome = scanner.nextLine();
     System.out.println("Digite as alergias do funcionário:");
     String alergias = scanner.nextLine();
     System.out.println("Digite os problemas médicos do funcionário:");
     String problemasMedicos = scanner.nextLine();
     System.out.println("Digite o telefone do funcionário:");
     String telefone = scanner.nextLine();
     System.out.println("Digite o email do funcionário:");
     String email = scanner.nextLine();

     
     Funcionario funcionario = new Funcionario(nome, alergias, problemasMedicos, telefone, email);

     
     System.out.println("\nInformações do Funcionário:");
     funcionario.exibirInformacoes();

     scanner.close();
 }
}

