package edu.monetary;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.monetary.domain.ConversionData;
import edu.monetary.domain.Conversor;

@SpringBootApplication
public class CashConversorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CashConversorApplication.class, args);

		ConversionData data = new ConversionData();
		data.setOriginAmount(BigDecimal.valueOf(100));
		data.setOriginCode("USD"); data.setDestinyCode("EUR");

		Conversor conversor = new Conversor(data);
		try {
			conversor.calculate();
			System.out.println(data.getDestinyAmount().setScale(2, RoundingMode.DOWN).toPlainString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
