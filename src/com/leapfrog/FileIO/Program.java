/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("c:/Users/Dell/Desktop/PracticeSample.txt");
        try {
            /*Writer writer = new FileWriter(file);
            writer.write("This is written from Java");
            writer.close();*/

            URL url = new URL("https://www.facebook.com/");
            URLConnection conn = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = "";
            StringBuilder content = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                content.append(line);
            }

            reader.close();
            FileWriter writer=new FileWriter("c:/Users/Dell/Desktop/PracticeSample.html");
            writer.write(content.toString());
            writer.close();
            System.out.println("Finished");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
