package com.ibm.training.music.rating.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.training.music.rating.entity.SongRating;
import com.ibm.training.music.rating.repository.SongRatingRepository;
import com.ibm.training.music.rating.response.Rating;
import com.ibm.training.music.rating.response.UserRatings;

@RestController
public class ApplicationController {
	
	@Autowired
	private SongRatingRepository repository;
	
	@GetMapping("ratings/{userId}")
	public UserRatings getRatingsByUser(@PathVariable("userId") int id ) {
		List<SongRating> songRatings = repository.getRatingsByUserId(id);
		List<Rating> ratings =  songRatings.stream().map(sr->{
			Rating rating = new Rating(sr.getKey().getUserId(), sr.getKey().getSongId(), sr.getRating());
			return rating;
		}).collect(Collectors.toList());
		UserRatings userRatings = new UserRatings();
		userRatings.setRatings(ratings);
		return userRatings;
	}
	

}
