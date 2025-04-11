package com.projetoplaylist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoplaylist.entities.Music;

@Repository
public interface MusicRepository  extends JpaRepository<Music, Long>{

}
