package com.poliana.dslist.dto;

import com.poliana.dslist.entities.Game;

public class GameMinDTO {

	private Long id;
	private String title;
	private Integer year;//year é uma palavra reservada no banco de dados
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO() {
	}

	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}

	public Long getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}

	

	public Integer getYear() {
		return year;
	}


	public String getImgUrl() {
		return imgUrl;
	}


	public String getShortDescription() {
		return shortDescription;
	}

	
	
	
}

