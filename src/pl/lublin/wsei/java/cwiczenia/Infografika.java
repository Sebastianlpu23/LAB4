package pl.lublin.wsei.java.cwiczenia;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Infografika {
    public String tytul;
    public String adresStrony;
    public String adresGrafiki;
    public String adresMiniaturki;
    public String wysokosc;
    public String szerokosc;



    public Infografika(String tekst){

        Pattern pat = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");
        Matcher m = pat.matcher(tekst);
        if(m.find()){
            tytul = m.group(1);
        }else{
            tytul = "";
        }

        pat = Pattern.compile("<link>(.*)<\\/link>");
        m = pat.matcher(tekst);
        if(m.find()){
            adresStrony = m.group(1);
        }else{
            adresStrony = "";
        }

        pat = Pattern.compile("<media:content url=\"(.*)\"");
        m = pat.matcher(tekst);
        if(m.find()){
            adresGrafiki = m.group(1);
        }else{
            adresGrafiki = "";
        }

        pat = Pattern.compile("<description><!\\[CDATA\\[<div><img src=\"(.*)\" a");
        m = pat.matcher(tekst);
        if(m.find()){
            adresMiniaturki = m.group(1);
        }else{
            adresMiniaturki = "";
        }

        pat = Pattern.compile("alt=\"\" width=\"(.*)\" h");
        m = pat.matcher(tekst);
        if(m.find()){
            szerokosc = m.group(1);
        }else{
            szerokosc = "";
        }

        pat = Pattern.compile("height=\"(.*)\"\\/>");
        m = pat.matcher(tekst);
        if(m.find()){
            wysokosc = m.group(1);
        }else{
            wysokosc = "";
        }


    }

    public void print() {
        System.out.print("Infografika:"+
                "\n\ttytul: " + tytul+
                "\n\tadres grafiki: "+ adresGrafiki +
                "\n\tadres strony: "+adresStrony+
                "\n\tadres miniaturki: "+ adresMiniaturki +
                "\n\trozmiar: "+wysokosc+"x"+szerokosc + "\n\n");
    }
}