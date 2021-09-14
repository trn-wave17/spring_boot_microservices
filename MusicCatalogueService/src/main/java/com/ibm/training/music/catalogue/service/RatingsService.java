package com.ibm.training.music.catalogue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ibm.training.music.catalogue.response.entity.Rating;
import com.ibm.training.music.catalogue.response.entity.UserRatings;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class RatingsService {
	
	@Autowired
	private RestTemplate template;
	
	/*@Autowired
	private RatingsServiceProxy proxy;*/
	
	@HystrixCommand(fallbackMethod = "getUserRatingsFallback")
	public UserRatings getUserRatings(int id) {
		return template.getForObject("http://zuul-api-gateway/rating-api/rservice/ratings/"+id, UserRatings.class);
		//return proxy.getRatingsByUser(id);
	}
	
	public UserRatings getUserRatingsFallback(int id) {
		UserRatings userRatings = new UserRatings();//Get  data from cache
		userRatings.setRatings(List.of(new Rating(1,1,3)));
		return userRatings;
	}

}
