package org.college.practise.task1;


public class Main {
    public static void main(String[] args) {

        Gallery gallery = new Gallery("Галерея папппая");

        gallery.addPicture(new Picture("Mona Lisa", 1231, "Artur "));
        gallery.addPicture( new Picture("Mox art" , 1356 , "Benjemin "));
        gallery.addPicture(new Picture("House", 1764, "Vragalik"));

        gallery.removePicture( new Picture("Mox art" , 1356 , "Benjemin "));
        System.out.println(new Picture("Mona Lisa", 1231, "Artur "));
        System.out.println("Count of pictures " + gallery.getPictureCount());

        System.out.println("Gallery name: " + gallery.getName());

        gallery.setArticle("It is a famous gallery");
        System.out.println("Article: " + gallery.getArticle());

        System.out.println(gallery.toString());
    }
}