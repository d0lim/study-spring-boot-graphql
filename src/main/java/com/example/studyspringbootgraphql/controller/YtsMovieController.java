package com.example.studyspringbootgraphql.controller;

import com.example.studyspringbootgraphql.repository.YtsMovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movie")
@RequiredArgsConstructor
public class YtsMovieController {

    private final YtsMovieRepository ytsMovieRepository;

    @GetMapping
    public String test() {
        this.ytsMovieRepository.testForListApi();
        return "hi";
    }


}
