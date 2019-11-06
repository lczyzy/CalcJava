package calc;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		double val1, val2, val3;
		
		Scanner input = new Scanner(System.in);
		int selection;

		do {
			System.out.println("1 - Adi��o");
			System.out.println("2 - Subtra��o");
			System.out.println("3 - Multiplica��o");
			System.out.println("4 - Divis�o");
			System.out.println("5 - Potencia��o");
			System.out.println("6 - Raiz quadrada");
			System.out.println("7 - Bhaskara");
			System.out.println("8 - Tem Impar?");
			System.out.println("9 - Pol�gono");
			System.out.println("10 - �ngulo");
			System.out.println("0 - Sair");
			System.out.print("\nDigite uma op��o: ");
			

			selection = input.nextInt();
			switch (selection) {
			case 1:
				System.out.print("\nInforme o primeiro valor: ");
				val1 = input.nextDouble();
				
				System.out.print("Informe o segundo valor: ");
				val2 = input.nextDouble();
				
				double soma = Calculadora.adicionar(val1, val2);
				
				System.out.println("Soma dos valores: " + soma + "\n\n");
				
				break;

			case 2:
				System.out.print("\nInforme o primeiro valor: ");
				val1 = input.nextDouble();
				
				System.out.print("Informe o segundo valor: ");
				val2 = input.nextDouble();
				
				double sub = Calculadora.subtrair(val1, val2);
				
				System.out.println("Subtra��o dos valores: " + sub + "\n\n");
				break;

			case 3:
				System.out.print("\nInforme o primeiro valor: ");
				val1 = input.nextDouble();
				
				System.out.print("Informe o segundo valor: ");
				val2 = input.nextDouble();
				
				double mult = Calculadora.multiplicar(val1,val2);
				
				System.out.println("Multiplica��o dos valores: " + mult + "\n\n");
				break;

			case 4:
				System.out.print("\nInforme o primeiro valor: ");
				val1 = input.nextDouble();
				
				System.out.print("Informe o segundo valor: ");
				val2 = input.nextDouble();
				
				double div = Calculadora.dividir(val1, val2);
				
				System.out.println("Divis�o dos valores: " + div + "\n\n");
				break;

			case 5:
				System.out.print("\nInforme o primeiro valor: ");
				val1 = input.nextDouble();
				
				System.out.print("Informe o segundo valor: ");
				val2 = input.nextDouble();
				
				double pot = Calculadora.potenciacao(val1, val2);
				
				System.out.println("Potencia��o dos valores: " + pot + "\n\n");
				break;

			case 6:
				System.out.print("\nInforme o valor para obter a raiz: ");
				val1 = input.nextDouble();
				
				double rq = Calculadora.raizQuadrada(val1);
				
				System.out.println("Raiz quadrada: " + rq + "\n\n");
				break;

			case 7:
				System.out.print("\nInforme o valor de A: ");
				val1 = input.nextDouble();
				
				System.out.print("Informe o valor de B: ");
				val2 = input.nextDouble();
				
				System.out.print("Informe o valor de C: ");
				val3 = input.nextDouble();
				
				Calculadora.bhaskara(val1, val2, val3);
				
				
				break;
				
			case 8:
				System.out.print("\nInforme o primeiro valor: ");
				val1 = input.nextDouble();
				
				System.out.print("Informe o o segundo valor : ");
				val2 = input.nextDouble();
				
				Calculadora.temImpar(val1, val2);
			break;
			
			case 9:
				System.out.print("\nInforme o n�mero de lados: ");
				int numLados = input.nextInt();	
				
				double vet[] = new double[numLados];
				
				for(int i=0; i<(int)numLados; i++) {
					System.out.print("\nInforme o valor do lado " + (i+1) + " : " );
					vet[i] = input.nextDouble();
				}
				
				Calculadora.poligono(vet);
				
			break;
			
			case 10:
				System.out.print("\nInforme o valor do �ngulo: ");
				double angulo = input.nextInt();	
				
		
				Calculadora.angulo(angulo);
				
			break;
			
				
			case 0:
				System.out.println("Saindo!!");
				break;

			default:
				System.out.println("Op��o inv�lida");
				break;
			}

			
			
			
		} while (selection != 8);

	}
}
