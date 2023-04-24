package com.example.openfeign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "omdbapi", url = "${omdb.key}")
public interface FilmeFeingClient {

    @GetMapping
    Filme search(@RequestParam("i") String id);

    @GetMapping
    ResultList findByName(@RequestParam("s") String title);
}
