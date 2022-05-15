package Aplication;
import java.util.Locale;
import java.util.Scanner;

import Entities.Funcionario;

public class Progem {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Bem vindo ao Funcionario.com");
		System.out.println();
		
		System.out.println("Pfvr digite o nome do colaborador: ");
		funcionario.nome =sc.nextLine();
		System.out.println("Pfvr digite o salario: ");
		funcionario.salario =sc.nextDouble();
		System.out.println("Pfvr digite a taxa: ");
		funcionario.taxa =sc.nextDouble();
		
		System.out.println();
		System.out.println("NOME: " + funcionario.nome);
		System.out.printf("SALARIO: %.2f%nTAXA: %.2f %n", funcionario.salario, funcionario.Saltaxa());
		
		System.out.println();
		System.out.println("Pfvr digite a porcentagem de aumento: ");
		double porcentagen = sc.nextDouble();
		funcionario.Salaumento(porcentagen);

		
		System.out.println();
		System.out.println(funcionario);
		sc.close();
	}

}
