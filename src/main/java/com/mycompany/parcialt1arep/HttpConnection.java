/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcialt1arep;

/**
 *
 * @author ADMIN
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.xml.ws.Response;
import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class HttpConnection {
    private static String key = "953f15a1a2a8b06a66b49a21841bcf7b";
    private static String api = "/api.openweathermap.org/data/2.5/weather?q="+ "Bogota" + "&appid=" + key ;

    public static void main(String[] args) throws IOException {

        /*URL url = new URL(api);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
         
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            System.out.println(response.toString());
        } else {
            System.out.println("GET request not worked");
        }
        System.out.println("GET DONE");*/
    }
    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>Inserte Ciudad</h2>"
                + "<form action=\"/results\">"
                + "  First name:<br>"
                + "  <input type=\"text\" name=\"city\" value=\"Mickey\">"
                + "  <br><br>"
                + "  <input type=\"submit\" value=\"Submit\">"
                + "</form>"
                + "<p>If you click the \"Submit\" button, the form-data will be sent to a page called \"/results\".</p>"
                + "</body>"
                + "</html>";
        return pageContent;
    }


} 
