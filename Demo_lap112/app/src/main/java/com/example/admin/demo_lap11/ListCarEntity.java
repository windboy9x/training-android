package com.example.admin.demo_lap11;

public class ListCarEntity {
    private String nameListCar; //Tên hãng xe
    private int imgListCar; //Mã ảnh hãng xe

    public ListCarEntity(String nameListCar, int imgListCar) {
        this.nameListCar = nameListCar;
        this.imgListCar = imgListCar;
    }

    public String getNameListCar() {
        return nameListCar;
    }

    public void setNameListCar(String nameListCar) {
        this.nameListCar = nameListCar;
    }

    public int getImgListCar() {
        return imgListCar;
    }

    public void setImgListCar(int imgListCar) {
        this.imgListCar = imgListCar;
    }
}
