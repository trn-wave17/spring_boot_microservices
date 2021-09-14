package com.ibm.training.music.catalogue.response.entity;

import java.util.List;

import com.ibm.training.music.catalogue.entity.MusicCatalogue;

public class UserMusicCatalogue {
	
	private List<MusicCatalogue> musicCatalogues;
	private String resultMessage;

	public List<MusicCatalogue> getMusicCatalogues() {
		return musicCatalogues;
	}

	public void setMusicCatalogues(List<MusicCatalogue> musicCatalogues) {
		this.musicCatalogues = musicCatalogues;
	}

	public String getResultMessage() {
		return resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	
	
	
	
	

}
