package com.example.demo.controller;

import com.example.demo.model.Album;
import com.example.demo.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlbumController {
    private final AlbumService albumService;

    @Autowired
    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @PostMapping("/create_album")
    public void saveAlbum(Album album) {
        albumService.saveAlbum(album);
    }

    @GetMapping("/read_all_album")
    public List<Album> findAll() {
        return albumService.findAll();
    }

    @DeleteMapping("/delete_album")
    public void deleteAlbum(Long id) {
        albumService.deleteById(id);
    }

    @GetMapping("/find_album")
    public Album findAlbum(Long id) {
        return albumService.findById(id).get();
    }
}
