package com.example.midtermRandomJoke_ThiHongGamTran_300284929.service;

import com.example.midtermRandomJoke_ThiHongGamTran_300284929.model.RandomJokes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImp implements JokeService {
    private final RandomJokes randomJokes;

    public JokeServiceImp() {
        this.randomJokes = new RandomJokes();
    }

    @Override
    public String getJoke() {
        return randomJokes.getRandomJokes();
    }
}
