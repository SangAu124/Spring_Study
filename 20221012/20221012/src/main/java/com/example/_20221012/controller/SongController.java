package com.example._20221012.controller;

import com.example._20221012.domain.Song;
import com.example._20221012.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/song")
public class SongController {

    private SongService songService;

    @Autowired
    public void setSongService(SongService songService) {
        this.songService = songService;
    }

    @RequestMapping("/add")
    public String add() {
        return "song/add";
    }

    @PostMapping("/add-save.do")
    public String addSave(
            @RequestParam("title") String title
            , @RequestParam("singer") String singer
            , @RequestParam("composer") String composer
            , @RequestParam("year") int year
    ) {
        // 데이터베이스에 노래를 저장한다.
        Song song = new Song(title, singer, composer, year);
        songService.addSong(song);

        return "redirect:list";
    }

}
