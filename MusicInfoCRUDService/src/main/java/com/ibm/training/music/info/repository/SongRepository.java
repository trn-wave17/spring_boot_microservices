package com.ibm.training.music.info.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.training.music.info.entity.Song;

public interface SongRepository extends JpaRepository<Song, Integer> {

}
