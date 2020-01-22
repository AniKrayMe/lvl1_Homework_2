package com.company;

import java.util.Objects;

public class Door {

    //region Properties
    private int quantity;
    private Material material;

    //endregion

    //region Constructor

    public Door(int quantity, Material material) {
        this.quantity = quantity;
        this.material = material;
    }

    public Door() {
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
        Door door = (Door) o;
        return quantity == door.quantity &&
                material == door.material;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, material);
    }

    @Override
    public String toString() {
        return "Door{" +
                "quantity=" + quantity +
                ", material=" + material +
                '}';
    }
//endregion

    //region methods
    public  void printQuantityOfWindows() {
        System.out.println("doors = " + this.quantity);
    }
    //endregion

}
