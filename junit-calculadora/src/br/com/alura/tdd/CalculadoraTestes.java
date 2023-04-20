package br.com.alura.tdd;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTestes {
	
//	public static void main(String[] args) {
//		Calculadora calc = new Calculadora();
//		int soma = calc.somar(3, 7);
//		System.out.println(soma);
//		
//		soma = calc.somar(3, 0);
//        System.out.println(soma);
//
//        soma = calc.somar(0, 0);
//        System.out.println(soma);
//
//        soma = calc.somar(3, -1);
//        System.out.println(soma);
//	}

	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);
		
		Assert.assertEquals(10, soma);
	}
}
