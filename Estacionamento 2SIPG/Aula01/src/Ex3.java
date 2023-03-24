import java.util.Scanner;
public class Ex3 {

	public static final int ALUNOS = 30;
	public static void main(String[] args) {
		
		int RM[] = new int[ALUNOS];
		double nota1[] = new double[ALUNOS];
		double nota2[] = new double[ALUNOS];
		double media[] = new double[ALUNOS];
		int aprovados[] = new int[ALUNOS];
		
		int n = entradaDados(RM, nota1, nota2);
		calculaMedia(n, nota1, nota2, media);
		System.out.println("\n\nMedias dos Alunos Cadastrados");
		for (int i = 0; i < n; i++) {
		  System.out.println("RM: " + RM[i] + " Media: " + media[i]);
		}
		
		int nAp = geraAprovados(n, RM, media, aprovados);
		 System.out.println("\nLista de aprovados: ");
		  for (int i = 0; i < nAp; i++) {
			  System.out.println(aprovados[i]);
		  }
	}
	
	
	public static int entradaDados(int RM[], double nota1[], double nota2[]) {
		
		Scanner input = new Scanner(System.in);
		int aux = 1;
		int n = 0;
		
		while (aux > 0 && n < ALUNOS) {
			System.out.print("Informe o RM do " + (n + 1) + " aluno, ou 0 para encerrar: ");
			aux = input.nextInt();
			if (aux > 0) {
				RM[n] = aux;
				System.out.print("Informe a primera nota do aluno " + RM[n] + ": ");
				nota1[n] = input.nextDouble();
				System.out.print("Informe a segunda nota do aluno " + RM[n] + ": ");
				nota2[n] = input.nextDouble();
				n++;
			}
	
			else
				System.out.println("Encerrado");				
		}
		
		input.close();
		return n;
	}
	
	public static void calculaMedia(int n, double nota1[], double nota2[], double media[]) {
		
		for (int i = 0; i < n; i++) {
			media[i] = (nota1[i] + nota2[i]) / 2;
		}
			
			
	}
	
	public static int geraAprovados(int n, int RM[], double media[], int aprovados[]) {
		
		int nAp = 0;
		for (int i = 0; i < n; i++) 
			if(media[i] >= 6) {
				aprovados[nAp] = RM[i];
				nAp++;
			}
		
		
		return nAp;
	}
	
	
	

}
