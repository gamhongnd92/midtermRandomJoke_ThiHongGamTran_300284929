package com.example.midtermRandomJoke_ThiHongGamTran_300284929.model;

public class Model {
   private String joke;
   private RandomJokes randomJokes;

    public Model(String joke) {
        this.joke = joke;
        randomJokes.getRandomJokes();
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }



    @Override
    public String toString() {
        return "Model{" +
                "joke='" + joke + '\'' +
                '}';
    }
}
