package com.example.servletjspdemo.web;




public class Form {
	
	String imie;
	String nazwisko;
	String hobby;
	String jedzenie;
	String cars;
	

	public String getImie() {
		return imie;
	}
	public void setImie(String value) {
		this.imie = value;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String value) {
		this.nazwisko = value;
	}
	public String getHobby() { return hobby;}
	
	public void setHobby(String value) {
		this.hobby = value;
	}
	public String getJedzenie() {return jedzenie;}
	
	public void setJedzenie(String value) {
		this.jedzenie = value;
	}
	public String getCars() {return cars;}
	public void setCars(String value) {
		this.cars = value;
	}
}