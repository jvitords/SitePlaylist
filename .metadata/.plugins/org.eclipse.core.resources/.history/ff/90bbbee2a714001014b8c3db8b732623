package com.projetoplaylist.entities.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.projetoplaylist.entities.Music;
import com.projetoplaylist.entities.Playlist;


public class PlaylistGetDTO implements Serializable { // class responsável por retornar os dados do GET

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String genre;
	private Integer quantityMusic;
	
	private List<Music> listMusics = new ArrayList<>();

	public PlaylistGetDTO() {
	}

	public PlaylistGetDTO(Playlist playlist) {
		this.name = playlist.getName();
		this.genre = playlist.getGenre();
		this.quantityMusic = playlist.getQuantityMusic();
		this.listMusics = playlist.getListMusics();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Integer getQuantityMusic() {
		return quantityMusic;
	}

	public void setQuantityMusic(Integer quantityMusic) {
		this.quantityMusic = quantityMusic;
	}

	public List<Music> getListMusics() {
		return listMusics;
	}

	public void setListMusics(List<Music> listMusics) {
		this.listMusics = listMusics;
	}
	
	
}
