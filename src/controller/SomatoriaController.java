package controller;

public class SomatoriaController {
	public double somaSerie(double num) {
		
		
		/*
		 * caso base
		 * 
		 * o 1 fixo da formula, quando o numero chegar a 1, retorna 1
		 */
		if (num==1) {
			return 1;
		}
		
		/*
		 * caso normal
		 * primeiro calcula o 1/n! e depois continua a recursao
		 */
		return (1/ (double)fatorial((int)num)) + somaSerie(num-1);
	}
	
	
	/*
	 * funcao auxiliar pra calcular o fatorial
	 */
	private int fatorial(int num) {
		if (num==1) {
			return 1;
		}
		
		return num * fatorial(num-1);
	}
}
