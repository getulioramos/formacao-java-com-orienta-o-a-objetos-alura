// Gerente e designer são um funcionario .  Gerente e Designer herda da classe funcionario
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Designer");
		return 200;
	}
	
}
