import java.util.*;
public class Exercicio2_2 {

	public static void main(String[] args) {
		// 1 - variaveis
		String nomeEmpregado;
		float salario;
		float novoSalario;
		Scanner leia = new Scanner(System.in);
		
		// 2 - entrada de dados
		System.out.print("Digite o nome do empregado: ");
		nomeEmpregado = leia.nextLine();
		
		System.out.print("Digite o salario atual: ");
		salario = leia.nextFloat();
		
		// 3 - calculos
		if (salario < 1000) {
			novoSalario = salario + (float)15 / 100 * salario;
		} else { // salario >= 1000
			novoSalario = salario + (float)10 / 100 * salario;
		}
		
		// saida de dados
		System.out.println("Novo salario: " + novoSalario);

	}

}
