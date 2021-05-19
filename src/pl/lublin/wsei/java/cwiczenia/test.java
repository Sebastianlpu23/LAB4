package pl.lublin.wsei.java.cwiczenia;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class test {
    public static void main(String[] args){

        try{
            String contents = new String(Files.readAllBytes(Paths.get("gusInfoGraphic.xml")));
            System.out.println("Zawartość pliku gusInfoGraphic.xml");
            System.out.print(contents);
        }
        catch(IOException e){
            System.out.println("Błąd wczytywania pliku => "+ e.getLocalizedMessage());
            e.printStackTrace();
        }
    }


}