package edu.monetary;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.monetary.domain.ConversionData;
import edu.monetary.domain.Conversor;

@SpringBootApplication
public class CashConversorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CashConversorApplication.class, args);

		Scanner input = new Scanner(System.in);

		print("Informe a moeda de origem: "); String origin = input.nextLine();
		print("Informe a moeda de destino: "); String destiny = input.nextLine();
		print("Informe o montante: "); BigDecimal amount = input.nextBigDecimal();

		
		ConversionData data = new ConversionData();
		data.setOriginAmount(amount);
		data.setOriginCode(origin); data.setDestinyCode(destiny);
		
		Conversor conversor = new Conversor(data);
		
		try {
			BigDecimal montanteFinal = conversor.calculate();
			print("Valor final: " + montanteFinal.setScale(2, RoundingMode.DOWN).toPlainString());
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void print(String string) {
		System.out.println(string);
	}

}
