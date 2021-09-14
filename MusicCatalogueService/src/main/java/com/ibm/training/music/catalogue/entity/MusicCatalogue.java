package com.ibm.training.music.catalogue.entity;

public class MusicCatalogue {
	
	private String songName;
	private String songArtist;
	private Integer rating;
	
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSongArtist() {
		return songArtist;
	}
	public void setSongArtist(String songArtist) {
		this.songArtist = songArtist;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public MusicCatalogue() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MusicCatalogue(String songName, String songArtist, Integer rating) {
		super();
		this.songName = songName;
		this.songArtist = songArtist;
		this.rating = rating;
	}
	
	

}
