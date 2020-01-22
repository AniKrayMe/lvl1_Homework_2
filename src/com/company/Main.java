package com.company;

public class Main {

    public static void main(String[] args) {
        Door door = new Door(3, Material.WOODEN);
        Window window = new Window(5,Material.PLASTIC);
        House house = new House();
        System.out.println(door);
        System.out.println(window);
        door.printQuantityOfWindows();
        window.printQuantityOfWindows();
    }
}
