//material square, type and price for one sheet in setSheetCost setter
//constructor with basic parametres

package com.dumpkin.avivi;

public class Material {
    public String paperName;
    private int density;
    private float width;
    private float height;
    private float sheetPrice;
    Paper material;

    public Material(float width, float height, int density, Paper material) {
        this.width = width;
        this.height = height;
        this.density=density;
        this.material = material;
    }

    public void setMaterial(Paper material) {
        this.material = material;
    }


    public Paper getMaterial() {
        return material;
    }

    public void setSheetCost(float setSheetPricePerKG) {
        this.sheetPrice = (1000*(density / (width * height))) * setSheetPricePerKG;

    }

    public float getSheetPrice() {
        return sheetPrice;
    }
}


