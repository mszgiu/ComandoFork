
/*Contagem de Dias do Mês: Peça o mês ao usuário e informe quantos dias 
 * ele tem.*/
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int mes;
		int dias = 0;

		System.out.println("Informe um numero do mês (1-12):");
		mes = scanner.nextInt();

		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			dias = 31;
		}

		else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			dias = 30;
		}

		else if (mes == 2) {
			dias = 28;
		}

		else {
			System.out.println("O mês informado é invalido.");
		}

		scanner.close();

		System.out.println("O mês " + mes + " tem " + dias + " dias.");

	}

}
