package Entities;

public class Funcionario {
	public double salario, taxa;
	public String nome;
	
	public double Saltaxa() {
		return salario- taxa;
	}
	public void Salaumento(double porcentagen) {
		salario += salario * porcentagen / 100.0;
	}
	public String toString() {
		return nome + ", $ " + String.format("%.2f", Saltaxa());
		}
	
}
