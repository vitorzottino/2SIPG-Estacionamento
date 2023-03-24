import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		entradaDados();

	}

	public static void entradaDados() {

		Scanner input = new Scanner(System.in);
		final int alunos = 30;
		int RM[] = new int[alunos];
		double nota1[] = new double[alunos];
		double nota2[] = new double[alunos];
		double media[] = new double[alunos];
		int aprovados[] = new int[alunos];
		int aux = 1;
		int n = 0;
		while (aux > 0 && n < alunos) {
			System.out.print("Informe o RM do " + (n + 1) + " aluno: ");
			aux = input.nextInt();
			if (aux > 0) {
				RM[n] = aux;
				System.out.print("Informe a primera nota do aluno " + RM[n] + ": ");
				nota1[n] = input.nextDouble();
				System.out.print("Informe a segunda nota do aluno " + RM[n] + ": ");
				nota2[n] = input.nextDouble();
				n++;
			}
	
			else {
				System.out.println("Encerrado");
				break;
			}	
		}
		
		input.close();
		
		
		int j = 0;
		
		
		for (int i = 0; i < n; i++) {
			media[i] = (nota1[i] + nota2[i]) / 2;
			System.out.println("RM: " + RM[i] + "\t Media: " + media[i]);
			if (media[i] >= 6) {
				aprovados[j] = RM[i];
				j++;
			}
			
		}
		
		System.out.println("\n\nAlunos Aprovados");
		for (int i = 0; i < j; i++)
			System.out.println("RM: " + aprovados[i]);
			
		
		
		
	}

}
