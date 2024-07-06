package com.eventmgmt.service.model;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

//Film class
public class Film {
	
	private String filmName;
	 private LocalDate releaseDate;
	 private int filmId;
 public Film(int filmId, String filmName, LocalDate releaseDate) {
		super();
		this.filmId = filmId;
		this.filmName = filmName;
		this.releaseDate = releaseDate;
	}

 public int getFilmId() {
	return filmId;
}
public void setFilmId(int filmId) {
	this.filmId = filmId;
}
public String getFilmName() {
	return filmName;
}
public void setFilmName(String filmName) {
	this.filmName = filmName;
}
public LocalDate getReleaseDate() {
	return releaseDate;
}
public void setReleaseDate(LocalDate releaseDate) {
	this.releaseDate = releaseDate;
}


}

