package com.ibm.training.music.rating.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ratings")
public class SongRating {
	
	@EmbeddedId
	private SongRatingKey key;
	
	@Column(name="rating")
	private Integer rating;
	
	public SongRatingKey getKey() {
		return key;
	}
	public void setKey(SongRatingKey key) {
		this.key = key;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public SongRating(SongRatingKey key, Integer rating) {
		super();
		this.key = key;
		this.rating = rating;
	}
	public SongRating() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SongRating [rating=" + rating + "]";
	}
	
	
	
	

}
