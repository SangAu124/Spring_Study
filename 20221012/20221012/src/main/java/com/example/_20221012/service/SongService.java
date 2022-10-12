package com.example._20221012.service;

import com.example._20221012.domain.Song;

public interface SongService {
    /**
    * 새 노래를 등록한다.
    *
    * @param song 노래 정보
    * @return 등록된 노래 정보
    * */
    public Song addSong(Song song);
}
