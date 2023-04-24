package com.example.openfeign.client;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("filmes")
public class FilmeController {

    private final FilmeFeingClient client;

    public FilmeController(FilmeFeingClient client) {
        this.client = client;
    }

    @GetMapping("/search/{id}")
    public Filme search(@PathVariable String id) {
        return client.search(id);
    }

    @GetMapping("/search")
    public List<Filme> findByName(@RequestParam("title") String title){
        return client.findByName(title).getResultList();
    }
}
