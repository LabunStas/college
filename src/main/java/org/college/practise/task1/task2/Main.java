package org.college.practise.task1.task2;

public class Main {
    public static void main(String[] args){
        Picture usaPicture = new Picture("Eagle", (short) 2015, "biden", "i do not know", "prezident","red, dark, white, yellow", new Size(1600,900),"vertical", "zaq");
        Picture uaPicture = new Picture("Flow", (short) 1998, "ja", "i do not know", "village","red, dark, blue, yellow", new Size(1600,900),"gorizontal", "qwe");
        UsaPictureBuilder usaPictureBuilder = new UsaPictureBuilder(usaPicture);
        UaPictureBuilder uaPictureBuilder = new UaPictureBuilder(uaPicture);
        uaPictureBuilder.build();
        System.out.println(uaPictureBuilder);
        usaPictureBuilder.build();
        System.out.println(usaPictureBuilder);
    }
}