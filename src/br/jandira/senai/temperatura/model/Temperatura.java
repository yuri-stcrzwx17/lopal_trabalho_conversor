package br.jandira.senai.temperatura.model;

public class Temperatura {

	private double celsius;

	public double converterParaFahrenheit() {
		return (celsius * 9 / 5) + 32;
	} // Converte Celcius para kelvin

	public double converterParaKelvin() {
		return celsius + 273.15;
	}

	public void getCelsius() {
		return;
	}

	public void setCelcius(double celsius) {
		this.celsius = celsius;
	}

}
