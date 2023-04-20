package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void BonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		
		BonusService service = new BonusService();
		assertThrows ( IllegalArgumentException.class,
				() -> service.calcularBonus (new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000"))));
		
		// utlizado qdo precisa ouvir saber da msg do exception
//		 try {
//             service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000")));
//             fail ("Não deu a exception!");
//     } catch (Exception e) {
//             assertEquals("Funcionario com salario maior do que R$10000 nao pode receber bonus!", e.getMessage());
//     }

		
	}
	
	
	@Test
	void BonusDeveriaSer10PorCentoDoSalario() {
		
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus (new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("2500")));
		
		assertEquals (new BigDecimal("250.00"), bonus);
		
	}
	
	@Test
	void BonusDeveriaSer10PoCentoParaSAlarioDeExatamente10000() {
		
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus (new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("10000")));
		
		assertEquals (new BigDecimal("1000.00"), bonus);
		
	}


}
