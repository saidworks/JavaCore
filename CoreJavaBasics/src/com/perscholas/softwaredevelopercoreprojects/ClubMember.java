package com.perscholas.softwaredevelopercoreprojects;

public class ClubMember {
	private String name,city,state,favoriteLanguage;

	public ClubMember(String name, String city, String state, String favoriteLanguage) {
		super();
		this.name = name;
		this.city = city;
		this.state = state;
		this.favoriteLanguage = favoriteLanguage;
	}

	public ClubMember() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
	
}
