package com.example.admin.demo_lap11;

public class ProductCarEntitiy {

    private String nameProCar;//Tên sản phẩm
    private int imgProCar;//Mã ảnh sản phẩm
    private String nxsProCar;//Nhà sản xuất sản phẩm
    private String stPricePro;//Giá ban đầu sp
    private String edPricePro;//Giá niêm yết sp

    public ProductCarEntitiy(String nameProCar, int imgProCar, String nxsProCar, String stPricePro, String edPricePro) {
        this.nameProCar = nameProCar;
        this.imgProCar = imgProCar;
        this.nxsProCar = nxsProCar;
        this.stPricePro = stPricePro;
        this.edPricePro = edPricePro;
    }

    public String getNameProCar() {
        return nameProCar;
    }

    public void setNameProCar(String nameProCar) {
        this.nameProCar = nameProCar;
    }

    public int getImgProCar() {
        return imgProCar;
    }

    public void setImgProCar(int imgProCar) {
        this.imgProCar = imgProCar;
    }

    public String getNxsProCar() {
        return nxsProCar;
    }

    public void setNxsProCar(String nxsProCar) {
        this.nxsProCar = nxsProCar;
    }

    public String getStPricePro() {
        return stPricePro;
    }

    public void setStPricePro(String stPricePro) {
        this.stPricePro = stPricePro;
    }

    public String getEdPricePro() {
        return edPricePro;
    }

    public void setEdPricePro(String edPricePro) {
        this.edPricePro = edPricePro;
    }
}
