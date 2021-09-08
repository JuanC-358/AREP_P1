/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcialt1arep;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author ADMIN
 */
public class Api {
    private String key = "953f15a1a2a8b06a66b49a21841bcf7b";
    public String getClima (String Ciudad) throws ApiError{
        try{
            URL api = new URL("/api.openweathermap.org/data/2.5/weather?q=" + Ciudad + "&appid=" + key);
            HttpURLConnection connection = (HttpURLConnection) api.openConnection();
            connection.setRequestMethod("GET");
            StringBuffer res = null;
            int responseCode = connection.getResponseCode();

            if (responseCode==HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine = in.readLine();
                res = new StringBuffer();
                while (inputLine!=null) {
                    res.append(inputLine);
                    inputLine = in.readLine();
                }

                in.close();
            }
            return String.valueOf(res);
        }catch (Exception e) {
            throw new ApiError(e.getMessage());
        }
    }
}
