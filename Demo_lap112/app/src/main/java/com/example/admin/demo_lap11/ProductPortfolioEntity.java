package com.example.admin.demo_lap11;

public class ProductPortfolioEntity {
    private String nameProductPortfolio; //Tên danh mục sản phẩm
    private int imgProductPortfolio; //Mã ảnh danh mục sản phẩm

    public ProductPortfolioEntity(String nameProductPortfolio, int imgProductPortfolio) {
        this.nameProductPortfolio = nameProductPortfolio;
        this.imgProductPortfolio = imgProductPortfolio;
    }

    public String getNameProductPortfolio() {
        return nameProductPortfolio;
    }

    public void setNameProductPortfolio(String nameProductPortfolio) {
        this.nameProductPortfolio = nameProductPortfolio;
    }

    public int getImgProductPortfolio() {
        return imgProductPortfolio;
    }

    public void setImgProductPortfolio(int imgProductPortfolio) {
        this.imgProductPortfolio = imgProductPortfolio;
    }
}
