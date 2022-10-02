package com.example.studyspringbootgraphql.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class YtsMovieRepository {
    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    private final String BASE_URL = "https://yts.torrentbay.to/api/v2/";
    private final String LIST_ENDPOINT = BASE_URL + "list_movies.json";
    private final String DETAIL_ENDPOINT = BASE_URL + "movie_details.json";

    public void testForListApi() {
        RestTemplate restTemplate = restTemplateBuilder.build();

        String res = restTemplate.getForObject(LIST_ENDPOINT, String.class);

        System.out.println(res);
    }
}
