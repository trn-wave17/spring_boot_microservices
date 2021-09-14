package com.ibm.training.music.info.resource;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.training.music.info.entity.Song;
import com.ibm.training.music.info.repository.SongRepository;

@RestController
public class ApplicationController {
	
	@Autowired
	private SongRepository repository;
	
	@GetMapping("song/{songId}")
	public Song getSongById(@PathVariable("songId") int id) {
		System.out.println(System.getProperty("server.port"));
		Optional<Song> optional = repository.findById(id);
		return optional.isPresent()? optional.get():null;
	}

}
