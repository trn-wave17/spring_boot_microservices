package com.ibm.training.music.rating.entity;

import java.io.Serializable;

import javax.persistence.Column;

public class SongRatingKey implements Serializable {
	
	@Column(name = "user_id")
	private Integer userId;
	
	@Column(name = "song_id")
	private Integer songId;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getSongId() {
		return songId;
	}
	public void setSongId(Integer songId) {
		this.songId = songId;
	}
	
	public SongRatingKey(Integer userId, Integer songId) {
		super();
		this.userId = userId;
		this.songId = songId;
	}
	public SongRatingKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
