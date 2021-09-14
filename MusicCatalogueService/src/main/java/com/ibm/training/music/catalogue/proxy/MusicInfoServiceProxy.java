package com.ibm.training.music.catalogue.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ibm.training.music.catalogue.response.entity.Song;

@FeignClient("zuul-api-gateway")
//@FeignClient("music-info-service")
@RibbonClient("music-info-service")
public interface MusicInfoServiceProxy {
	
	@GetMapping("song-api/sservice/song/{songId}")
	public Song getSongById(@PathVariable("songId") int id);
}
