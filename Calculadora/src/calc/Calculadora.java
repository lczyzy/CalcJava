package calc;

public class Calculadora {

	// soma
	public static double adicionar(double val1, double val2) {
		return val1 + val2;
	}

	// subtracao
	public static double subtrair(double num1, double num2) {
		return num1 - num2;
	}

	// multiplicacao
	public static double multiplicar(double num1, double num2) {
		return num1 * num2;
	}

	// divisão
	public static double dividir(double num1, double num2) {
		if (num2 == 0) {
			throw new IllegalArgumentException("Número não pode ser zero!");
		}

		return num1 / num2;
	}

	// potenciação
	public static double potenciacao(double num1, double num2) {
		return Math.pow(num1, num2);
	}

	// raiz quadrada
	public static double raizQuadrada(double num) {
		return Math.sqrt(num);
	}

	// bhaskara-x1-x2
	public static void bhaskaraResulados(double delta, double a, double b) {
		double x1 = (double) ((-(b) + Math.sqrt(delta)) / 2 * a);
		double x2 = (double) ((-(b) - Math.sqrt(delta)) / 2 * a);

		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2 + "\n");
	}

	// bhaskara-delta
	public static void bhaskara(double a, double b, double c) {

		double delta = (b * b) + (-4 * (a * c));

		if (delta >= 0) {
			bhaskaraResulados(delta, a, b);
		} else {
			System.out.println("\nDelta não possui raiz!");
			System.exit(0);
		}

	}
	
	public static void angulo(double angulo) {

		if(angulo<90) {
			
			double seno = Math.sin(Math.toRadians(angulo)); 
			System.out.println("\nSeno = " + seno + "\n\n");
		
		}else {
			double cosseno = Math.cos(Math.toRadians(angulo)); 
			System.out.println("\nCosseno = " + cosseno + "\n\n");
		}
		
		//# se tangente do ângulo <> 1
		double tangente = Math.tan(Math.toRadians(angulo));
		System.out.println("\nTangente = " + tangente + "\n\n");

	}
	
	
	
	public static void poligono(double vet[]) {
		int lados = vet.length;
		
		if(lados==3) {

			System.out.println("\nLados = 3\n\n");
			
			
			double a,b,c;
			a = vet[0];
			b = vet[1];
			c = vet[2];
			
			double perimetro;
			
			
			if(a==b && b==c) {
				//tudo igual
				System.out.println("\nTriângulo Equilátero");
				
				perimetro = a+b+c;
				System.out.println("Perímetro: " + perimetro + "\n\n");
				
			}else if(a==b || b==c){
				//dois iguais
				System.out.println("\nTriângulo Isóceles");
				
				perimetro = a+b+c;
				System.out.println("Perímetro: " + perimetro + "\n\n");
			}else {
				//tudo diferente
				System.out.println("\nTriângulo Escaleno");
				
				perimetro = a+b+c;
				System.out.println("Perímetro: " + perimetro + "\n\n");
			}
			
			
			
		}else {
			System.out.println("\nLados diferentes de 3\n\n");
			
			if(lados==4) {
				System.out.println("Tem 4 lados!!");
				
				double a,b,c,d;
				a = vet[0];
				b = vet[1];
				c = vet[2];
				d = vet[3];
				
				double perimetro=0;
				
				if(a==b & b==c & c==d) {
					System.out.println("É quadrado!!");
					perimetro = a * 4;
					System.out.println("Perímetro: " + perimetro + "\n\n");
				}else {
					System.out.println("Tem quatro lados!!");
					
					for (int i=0; i < vet.length; i++) {
						perimetro += vet[i];
					}
					
					System.out.println("Perímetro: " + perimetro + "\n\n");
				}
				
				
			}else {
				System.out.println("Tem " + lados + "lados");
				
				double perimetro=0;
				
				for (int i=0; i < vet.length; i++) {
					perimetro += vet[i];
				}
				
				System.out.println("Perímetro: " + perimetro + "\n\n");

			}
			
		}
	}

	
	
	public static void temImpar(double val1, double val2) {
		
		if(val1 %2==0 && val2%2==0) {
			
			double resultado = val1+val2;
			
			if(resultado>5) {
				resultado += 5;
				System.out.println("\nResultado: " + resultado);
			}else {
				System.out.println("\nResultado: " + resultado);
			}
			
		}else {
			double resultado = val1 * val2;
			
			if(resultado > 10) {
				System.out.println("\nResultado: " + resultado);
			}else {
				resultado += 10;
				System.out.println("\nResultado: " + resultado);
			}
			
		}
	}
	
	
}

