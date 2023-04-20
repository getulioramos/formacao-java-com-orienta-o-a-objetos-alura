class Fatorial {
    
	public static void main(String[] args) {
        int fatorial = 1;
        for (int i = 1; i < 11; i++) {
            
        	//dentro do for a variavel fatorial será multiplicada pelo valor do "i';
        	//Multiplica o valor do primeiro operando pelo valor do segundo operando; 
        	//armazena o resultado no objeto especificado pelo primeiro operando.
        	fatorial *= i;
            System.out.println("Fatorial de " + i + " = " + fatorial);
        }
    }
}