package com.example._20221012.controller;

import com.example._20221012.domain.Song;
import com.example._20221012.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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

    @GetMapping("/list")
    public ModelAndView list() {
        ModelAndView mv = new ModelAndView("song/list");

        List<Song> list = songService.getList();
        mv.addObject("list", list);

        return mv;
    }

    @GetMapping("/view/{idx}")
    public ModelAndView view(
            @PathVariable("idx") Long idx
    ) {
        ModelAndView mv = new ModelAndView("song/view");

        Song song = songService.read(idx);
        mv.addObject("song", song);

        return mv;
    }

    @GetMapping("/update/{idx}")
    public ModelAndView update(
            @PathVariable("idx") Long idx
    ) {
        ModelAndView mv = new ModelAndView("song/update");

        Song song = songService.read(idx);
        mv.addObject("song", song);

        return mv;
    }

    @RequestMapping("/update-save.do")
    public String updateSave(
            @RequestParam("idx") Long idx
            , @RequestParam("title") String title
            , @RequestParam("singer") String singer
            , @RequestParam("composer") String composer
            , @RequestParam("year") int year
    ) {
        // 데이터베이스에 노래를 저장한다.
        Song song = new Song(title, singer, composer, year);
        song.setIdx(idx);

        songService.update(song);

        return "redirect:list";
    }

    @RequestMapping("/delete.do/{idx}")
    public String delete(
            @PathVariable("idx") Long idx
    ) {
        songService.delete(idx);

        return "redirect:../list";
    }

}
