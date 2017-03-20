package edu.hackeru;

import com.google.gson.Gson;

import java.io.IOException;

/**
 * Created by hackeru on 20/03/2017.
 */
public class MoviesThread extends Thread { //Can't Inherit
    @Override
    public void run() {
        //Write Your code here...
        try {
            String data = HTTPUtils.getUrl(
                    "http://api.androidhive.info/json/movies.json");

            Gson gson = new Gson();
            Movie[] movies = gson.fromJson(data, Movie[].class);
            //reflection....


            for (Movie m : movies) {
                System.out.println(m);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
