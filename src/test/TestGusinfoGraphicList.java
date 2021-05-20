package test;

import pl.lublin.wsei.java.cwiczenia.GusInfoGraphicList;
import pl.lublin.wsei.java.cwiczenia.Infografika;

class TestGusInfoGraphicList {
    public static void main(String[] args){
        GusInfoGraphicList list = new GusInfoGraphicList("gusInfoGraphic.xml");

        for(Infografika i: list.infografiki) i.print();
    }
}