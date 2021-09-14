package com.ibm.training.music.info.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="songs_info")
public class Song {
	@Id
	@Column(name="song_id")
	private int id;
	
	@Column(name="song_name")
	private String songName;
	
	@Column(name="song_artist")
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
