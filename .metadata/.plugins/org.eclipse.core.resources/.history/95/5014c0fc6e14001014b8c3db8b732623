package com.projetoplaylist.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Music implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	private String name;
	private String artist;
	private Double time;
	
	@ManyToMany(mappedBy = "listMusics")
	private List<Playlist> playlist;
	
	public Music() {
	}

	public Music(Long id, String name, String artist, Double time) {
		this.id = id;
		this.name = name;
		this.artist = artist;
		this.time = time;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public Double getTime() {
		return time;
	}

	public void setTime(Double time) {
		this.time = time;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) { // compara pelo nome da musica
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		return Objects.equals(name, other.name);
	}
	
	
}
