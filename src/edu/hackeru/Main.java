package edu.hackeru;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
        //this object can open a connection to the url.
        try {
            //all that the MalformedURLException does is verify the validity of the URL
            URL url = new URL("http://www.google.co.il");

            //2) Open Connection to the URL
            HttpURLConnection con = (HttpURLConnection) url.openConnection();


            //3) get the data as an InputStream:
            InputStream in = con.getInputStream();
            //con.getHeaderField("...");
            int code = con.getResponseCode();//200, 404, 400, 401
            //in - > String
            System.out.println(IO.read(in));
        } catch (MalformedURLException e) {
            System.out.println("Invalid address");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Can't open Connection");
        }


        //3) con.getInputStream

    }
}
