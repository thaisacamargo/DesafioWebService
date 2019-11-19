package com.example.marvel.repository;

import com.example.marvel.model.ComicResponse;

import io.reactivex.Observable;

import static com.example.marvel.data.remote.RetrofitService.getApiService;

public class ComicRepository {
    public static final String PUBLIC_KEY​ = "6eb7e8896ec5850c52515a8a23ee97f0";

    public Observable<ComicResponse> getComics(){
        return getApiService().getComics("magazine", "comic", true, "1551213595", "9584823101fd40c435d4c028df6daca3", "6eb7e8896ec5850c52515a8a23ee97f0");
    }
}
