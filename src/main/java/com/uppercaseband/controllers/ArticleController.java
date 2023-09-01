package com.uppercaseband.controllers;

import com.uppercaseband.models.ArticleDTO;
import com.uppercaseband.services.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class ArticleController {

    //provide a constant for the base URL
    public static final String BASE_URL = "/api/v1/articles";

    private final ArticleService articleService;


    @GetMapping(ArticleController.BASE_URL)
    public Flux<ArticleDTO> getAllArticles() {

        return articleService.getAllArticles();
    }


    @GetMapping(path = ArticleController.BASE_URL, params = "category")
    public Flux<ArticleDTO> getArticlesByCategory(@RequestParam Optional<String> category) {

        if (category.isPresent()) {
            return articleService.getArticlesByCategory(category.get().toUpperCase())
                    .switchIfEmpty(Flux.error(new ResponseStatusException(HttpStatus.NOT_FOUND)));
        } else {
            return Flux.error(new ResponseStatusException(HttpStatus.NOT_FOUND));
        }
    }
}
