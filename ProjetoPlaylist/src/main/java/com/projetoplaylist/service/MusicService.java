package com.projetoplaylist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoplaylist.entities.Music;
import com.projetoplaylist.repository.MusicRepository;
import com.projetoplaylist.service.exception.NotFoundException;

@Service
public class MusicService {
	
	@Autowired
	MusicRepository musicRepository;

	public MusicService() {
	}

	public MusicService(MusicRepository musicRepository) {
		this.musicRepository = musicRepository;
	}
	
	public Music findById(Long id) {
		return musicRepository.findById(id).orElseThrow(() -> new NotFoundException("Música não encontrada."));
	}
	
	public List<Music> findAll() {
		return musicRepository.findAll();
	}
}
