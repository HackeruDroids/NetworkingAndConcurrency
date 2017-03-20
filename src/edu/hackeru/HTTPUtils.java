package edu.hackeru;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by hackeru on 20/03/2017.
 */
public class HTTPUtils {


    public static String getUrl(String address) throws IOException {
        //1)URL - An Object that defines an internet address
        //this object can open a connection to the url.
        try {
            //all that the MalformedURLException does is verify the validity of the URL
            URL url = new URL(address);

            //2) Open Connection to the URL
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            //3) get the data as an InputStream:
            InputStream in = con.getInputStream();
            //con.getHeaderField("...");
            int code = con.getResponseCode();//200, 404, 400, 401
            //in - > String
            return IO.read(in);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }

    }

}
