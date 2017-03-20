package edu.hackeru;

import com.google.gson.Gson;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            String data = HTTPUtils.getUrl("http://api.androidhive.info/json/movies.json");
            System.out.println(data);

            Gson gson = new Gson();
            Movie[] movies = gson.fromJson(data, Movie[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
