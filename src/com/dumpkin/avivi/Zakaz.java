//zakaz info with status contragent and profit calculation

package com.dumpkin.avivi;

public class Zakaz {

    public static long number;
    private Contragent contragent;
    private Material material;
    private boolean sklad;
    private Status status;
    private double price;
    public int quantity;

    public Zakaz(Contragent contragent, Material material, int quantity) {
        this.contragent = contragent;
        this.material = material;
        this.quantity = quantity;
        this.price=material.getSheetPrice()*quantity;
        number++;
    }

    public boolean isSklad() {
        return sklad;
    }

    public void setSklad(boolean sklad) {
        this.sklad = sklad;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public double getPrice() {
        return this.price;
    }


    }

