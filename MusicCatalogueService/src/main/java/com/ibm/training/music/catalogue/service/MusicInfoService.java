package com.ibm.training.music.catalogue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.training.music.catalogue.proxy.MusicInfoServiceProxy;
import com.ibm.training.music.catalogue.response.entity.Song;

@Service
public class MusicInfoService {
	
	/*@Autowired
	private RestTemplate template;*/
	
	@Autowired
	private MusicInfoServiceProxy proxy;
	
	//@HystrixCommand(fallbackMethod = "getSongInfoFallback")
	public Song getSongInfo(int songId) {
		return proxy.getSongById(songId);
	}
	
	public Song getSongInfoFallback(int songId) {
		return new Song(-1,"Empty","Empty");//Get  data from cache
	}

}
