package com.example.openfeign.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
@Getter
public class ResultList {
    @JsonProperty("Search")
    private List<Filme> resultList;
}
