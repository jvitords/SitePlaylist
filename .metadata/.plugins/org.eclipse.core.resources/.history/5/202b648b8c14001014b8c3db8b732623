package com.projetoplaylist.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;

import com.projetoplaylist.entities.Playlist;
import com.projetoplaylist.repository.PlaylistRepository;

@org.springframework.context.annotation.Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	PlaylistRepository playlistRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Playlist p1 = new Playlist(null, "Funk RJ", "Funk");
		playlistRepository.save(p1);
		Playlist p2 = new Playlist(null, "Jorge e Matheus", "Sertanejo");
		playlistRepository.save(p2);
		Playlist p3 = new Playlist(null, "Pixote", "Pagode");
		playlistRepository.save(p3);
	}

}
