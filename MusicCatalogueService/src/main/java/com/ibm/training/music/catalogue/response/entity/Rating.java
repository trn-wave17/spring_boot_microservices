package com.ibm.training.music.catalogue.response.entity;

public class Rating {
	
	private int userId;
	private int songId;
	private int rating;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getSongId() {
		return songId;
	}
	public void setSongId(int songId) {
		this.songId = songId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Rating(int userId, int songId, int rating) {
		super();
		this.userId = userId;
		this.songId = songId;
		this.rating = rating;
	}
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
