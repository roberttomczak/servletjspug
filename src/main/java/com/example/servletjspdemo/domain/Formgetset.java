package com.example.servletjspdemo.domain;

public class Formgetset {
	
	private String imie, nazwisko, hobby, jedzenie, cars;

	public Formgetset() {
		super();
	}
	
	public Formgetset(String imie, String nazwisko, String hobby, String jedzenie, String cars) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.hobby = hobby;
		this.jedzenie = jedzenie;
		this.cars = cars;
	}
	
	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getJedzenie() {
		return jedzenie;
	}

	public void setJedzenie(String jedzenie) {
		this.jedzenie = jedzenie;
	}

	public String getCars() {
		return cars;
	}

	public void setCars(String cars) {
		this.cars = cars;
	}  

}
