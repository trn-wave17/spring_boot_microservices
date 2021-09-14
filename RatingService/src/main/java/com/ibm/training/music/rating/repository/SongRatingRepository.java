package com.ibm.training.music.rating.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ibm.training.music.rating.entity.SongRating;
import com.ibm.training.music.rating.entity.SongRatingKey;

public interface SongRatingRepository extends JpaRepository<SongRating, SongRatingKey> {
	
	@Query(value="select r from SongRating r where user_id = :userId")
	List<SongRating> getRatingsByUserId(int userId);
}
