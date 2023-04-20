
public class TestaValores {
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		
		segundo = primeiro;
		/*A variável segundo, que é 7, recebe o valor da variável primeiro, que é 5,
		logo a variável segundo é 5 */
		
		primeiro = 10;
		/*A variável segundo, que é 7, recebe o valor da variável primeiro, que é 5,
		logo a variável segundo é 5 */
		
		System.out.println(segundo);
	}

}
