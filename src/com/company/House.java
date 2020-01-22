package com.company;

import java.util.Objects;

public class House {

    //region Properties
    private Window window;
    private Door door;
    //endregion

    //region Constructor

    public House(Window window, Door door) {
        this.window = window;
        this.door = door;
    }

    public House() {
    }
    //endregion

    //region Getter and Setter

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    //endregion

    //region toString, equals and hashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(window, house.window) &&
                Objects.equals(door, house.door);
    }

    @Override
    public int hashCode() {
        return Objects.hash(window, door);
    }


    @Override
    public String toString() {
        return "House{" +
                "window=" + window +
                ", door=" + door +
                '}';
    }
    //endregion

  //region methods
    public static void lockTheHouseByKey() {
        System.out.println("the door was closed");
    }
    //endregion
}
