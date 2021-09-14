package com.ibm.training.music.catalogue.response.entity;

public class Song {
	
	private int id;
	private String songName;
	private String songArtist;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public Song(int id, String songName, String songArtist) {
		super();
		this.id = id;
		this.songName = songName;
		this.songArtist = songArtist;
	}

	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
