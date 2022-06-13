package vetoresAeB;
import java.util.Scanner;

public class VetoresAeB 
{

	public static void main(String[] args) 
	{
		int x = 0, c = 0,  mult = 0;
		int A[] = new int[5],B[] = new int[5];//vetor A e B com 5 posicoes
		Scanner read = new Scanner(System.in);
	 
				
		for(x = 0; x <= 4; x++)
		{
			System.out.printf("Digite o valor da posição (%d) do vetor A", x);// entrada do valor para cada posicao do vetor A
			A[x] = read.nextInt();												//Grava valor em cada posicao do vetor A
		}	
		System.out.println("\n");
		for(x = 0; x <= 4; x++)
		{
			System.out.printf("Digite o valor da posição (%d) do vetor B", x);
			B[x] = read.nextInt();
		}
			for(x = 0;x < 5; x++)
			{
			mult = A[x]*B[x];								//Multiplica posicoes iguais entre A e B  grava na variavel 'mult'
			c = c + mult;									//variavel c recebe ele mesmo + variavel 'mult'
			
			}
		
		System.out.print("\n");
		System.out.printf("O resultado de c e %d",c);			//exibe valor de 'c'

	}

}
			
