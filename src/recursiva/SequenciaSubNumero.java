package recursiva;

public class SequenciaSubNumero {
	public static void main(String[] args) {
		int num = 12345;
		int num2 = 23;
		System.out.println(functionSerie(num, num2));
	}
	static String functionSerie(int num, int num2) {
		if(num % 100 == num2) {
			return Integer.toString(num2) + " est� contido em " + Integer.toString(num);
		}else if(num < 10) {
			return Integer.toString(num2) + " n�o est� contido em " + Integer.toString(num);
		}
		else{
			return functionSerie(num/10, num2);
		}
	}
}
