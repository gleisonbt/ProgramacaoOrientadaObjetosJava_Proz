package br.com.introducaoClasse;

import java.util.Locale;

import javax.swing.JOptionPane;

class Pessoa{
	String nome;
	int idade;
	float peso;
	float altura;
	float imc;
	
	boolean eMaiorDeIdade() {
		if (idade > 17) 
			return true;
		return false;
	}
	
	/**
	 * calcula valor do IMC seguindo a formula altura/peso^2
	 */
	void calculaIMC() {
		imc = (float) (peso/(Math.pow(altura, 2)));
	}
	
	/**
	 * retorna se a pessoa tem sobrepeso ou esta abaixo do peso ou peso normal
	 * @return String
	 */
	String retornaDiagnosticoIMC() {
		if (imc < 18.5) {
			return "Abaixo do peso";
		} else if(imc < 24.9) {
			return "Peso normal";
		} else if(imc < 29.9) {
			return "Sobrepeso";
		}
		return "Obesidade";
	}

}

public class Main {
	public static void main(String[] args) {
		int qtdePessoas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de pessoas que "
				+ "serão cadastradas: "));
		
		/*
		 * Inicializa array com a quantidade de pessoas que será lida
		 */
		int[] pessoas = new int[qtdePessoas];
		
		for (int i = 0; i < pessoas.length; i++) {
			Pessoa p  = new Pessoa();
			p.nome = JOptionPane.showInputDialog("Nome: ");
			p.idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
			p.altura  = Float.parseFloat(JOptionPane.showInputDialog("Altura: "));
			p.peso  = Float.parseFloat(JOptionPane.showInputDialog("Peso: "));
			p.calculaIMC();
			
			if (p.eMaiorDeIdade())
				JOptionPane.showMessageDialog(null, "Maior de Idade");
			else
				JOptionPane.showMessageDialog(null, "Menor de Idade");
			//JOptionPane.showMessageDialog(null, p.eMaiorDeIdade() ? "Maior de Idade" : "Menor de Idade");
			
			JOptionPane.showMessageDialog(null, "Valor do IMC: " + String.format(Locale.US, "%.2f", p.imc)
				+ "\n" + p.retornaDiagnosticoIMC());
		}
		
	}
}
