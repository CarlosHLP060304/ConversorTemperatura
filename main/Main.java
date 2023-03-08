package main;

import java.util.Scanner;

import temperatura.Temperatura;

public class Main {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Digite uma temperatura (na escala Celsius):");
		float temperatura_Celsius_Digitada = sc.nextFloat();
		Temperatura temperatura = new Temperatura();
		System.out.println(temperatura_Celsius_Digitada + " graus Celsius em graus Fahrenheit é: " + temperatura.converterParaFahrenheit(temperatura_Celsius_Digitada) + " graus F");
		System.out.println(temperatura_Celsius_Digitada + " graus Celsius em graus Kelvin é: " + temperatura.converterParaKelvin(temperatura_Celsius_Digitada) + "K");
	}
}