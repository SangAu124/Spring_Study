package com.example._20221012.service;

import com.example._20221012.domain.Song;
import com.example._20221012.entity.SongEntity;
import com.example._20221012.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "songService")
public class SongServiceImpl implements SongService {
    private SongRepository songRepository;

    @Autowired
    public void setSongRepository(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @Override
    public Song addSong(Song song) {
        // TODO
        SongEntity songEntity = new SongEntity(
                song.getTitle()
                , song.getSinger()
                , song.getComposer()
                , song.getYear()
        );
        songRepository.save(songEntity);

        return song;
    }
}
