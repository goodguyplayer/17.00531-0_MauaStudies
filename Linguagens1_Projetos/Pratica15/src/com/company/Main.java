package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws Exception {
	    LeituraJavaAte8();

    }

    private static void LeituraJavaAte8() throws Exception {
        URL url = new URL("https://viacep.com.br/ws/01001000/json/");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        int statusCode = con.getResponseCode();
        System.out.println("Status code.: " + statusCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        con.getInputStream()
                )
        );

        String result;
        StringBuffer content = new StringBuffer();
        while( (result = in.readLine()) != null){
            content.append(result);
        }
        in.close();
        System.out.println("Recebidos:");
        System.out.println(content);
    }
}
