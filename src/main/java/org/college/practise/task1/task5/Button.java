package org.college.practise.task1.task5;

public class Button extends WindowComponent {
    private String text;
    private String imagePath;

    public Button(String name, String text, String imagePath) {
        this.name = name;
        this.text = text;
        this.imagePath = imagePath;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Button: " + text + " (Image: " + imagePath + ")");
    }
}