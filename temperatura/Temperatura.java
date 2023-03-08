package temperatura;

public class Temperatura {
	
	private String tipoEscala;
	
	public Temperatura(){
		tipoEscala = "Celsius";
	}
	
	public String getTipoEscalaPadrao() {
		return tipoEscala;
	}

	public float converterParaFahrenheit(float temperaturaCelsius){
		float temperaturaFahrenheit = temperaturaCelsius * 9 / 5 + 32;
		return temperaturaFahrenheit;
	}
	
	public float converterParaKelvin(float temperaturaCelsius){
		float temperaturaKelvin = temperaturaCelsius + 273;
		return temperaturaKelvin;
	}
	

}