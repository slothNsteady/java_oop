package com.java_oop;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var textBox1 = new TextBox();
        textBox1.setText("Box 1");
        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        var textBox3 = textBox1;
        textBox3.setText("Box 3");

        System.out.println(textBox1.text.toUpperCase());
        System.out.println(textBox2.text.toUpperCase());
        System.out.println(textBox3.text.toUpperCase());


    }
}
