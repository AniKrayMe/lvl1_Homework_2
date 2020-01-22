package com.company;

import java.util.Objects;

public class Window {
    //region Properties
    private int quantity;
    private Material material ;
    //endregion

    //region Constructor

    public Window(int quantity, Material material) {
        this.quantity = quantity;
        this.material = material;
    }

    public Window() {
    }
//endregion

    //region Getter and Setter

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }


    //endregion

    //region toString, equals and hashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Window window = (Window) o;
        return quantity == window.quantity &&
                material == window.material;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, material);
    }

    @Override
    public String toString() {
        return "Window{" +
                "quantity=" + quantity +
                ", material=" + material +
                '}';
    }
    //endregion

    //region methods
    public void printQuantityOfWindows(){
        System.out.println("windows = "+this.getQuantity());

    }

    //endregion

}
