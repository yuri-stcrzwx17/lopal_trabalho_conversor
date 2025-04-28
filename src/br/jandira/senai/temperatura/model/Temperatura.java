package br.jandira.senai.temperatura.model;

public class Temperatura {

    private double celcius;

public double converterParaFahrenheit() {
	return (celcius * 9/5) + 32;
} // Converte Celcius para kelvin

public double converterParaKelvin() {
	return celcius + 273.15;
}


public void getCelcius() {
	return;
}

public void setCelcius(double celcius) {
	this.celcius = celcius;
}


}
