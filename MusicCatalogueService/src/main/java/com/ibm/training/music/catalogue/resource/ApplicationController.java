package com.ibm.training.music.catalogue.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ibm.training.music.catalogue.entity.MusicCatalogue;
import com.ibm.training.music.catalogue.response.entity.Song;
import com.ibm.training.music.catalogue.response.entity.UserMusicCatalogue;
import com.ibm.training.music.catalogue.response.entity.UserRatings;
import com.ibm.training.music.catalogue.service.MusicInfoService;
import com.ibm.training.music.catalogue.service.RatingsService;
/*
 * number of requests you want to analyze
 * threshold number  - failing requests
 * timeout
 * sleep
 * commandProperties = {
	        @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "30000"),
	        @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "4"),
	        @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "60000"),
	        @HystrixProperty(name = "metrics.rollingStats.timeInMilliseconds", value = "180000") }*/
@RestController
public class ApplicationController {
	
	@Autowired
	private MusicInfoService musicInfoService;
	
	@Autowired
	private RatingsService ratingsService;
	
	@GetMapping("/catalogue/user/{userId}")
	public UserMusicCatalogue getMusicCataloguesForUser(@PathVariable("userId") int id) {
		
		UserRatings ratings = ratingsService.getUserRatings(id);
		
		List<MusicCatalogue> mcs = ratings.getRatings().stream().map(rating->{
			Song song = musicInfoService.getSongInfo(rating.getSongId());
			MusicCatalogue mc = new MusicCatalogue(song.getSongName(), song.getSongArtist(), rating.getRating());
			return mc;
		}).collect(Collectors.toList());
		
		UserMusicCatalogue umc = new UserMusicCatalogue();
		umc.setMusicCatalogues(mcs);
		return umc;
	}
	
	

}
