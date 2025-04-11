package com.projetoplaylist.entities.playlistdto;

import java.io.Serializable;

import com.projetoplaylist.entities.Playlist;

public class PlaylistPutDTO implements Serializable{ // class responsável por receber os dados do PUT

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String genre;

	public PlaylistPutDTO() {
	}
	
	public PlaylistPutDTO(Playlist playlist) {
		this.name = playlist.getName();
		this.genre = playlist.getGenre();
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
}
 