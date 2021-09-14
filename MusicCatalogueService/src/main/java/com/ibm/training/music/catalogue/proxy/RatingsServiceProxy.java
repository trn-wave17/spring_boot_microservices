package com.ibm.training.music.catalogue.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ibm.training.music.catalogue.response.entity.UserRatings;

//@FeignClient("rating-service")
//@RibbonClient("rating-service")
public interface RatingsServiceProxy {
	@GetMapping("rservice/ratings/{userId}")
	public UserRatings getRatingsByUser(@PathVariable("userId") int id );
}
