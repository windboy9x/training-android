package com.example.admin.demo_lap11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class ProductCar extends AppCompatActivity {

    private GridView mGrid;
    private List<ListCarEntity> listLstCar = new ArrayList<ListCarEntity>();
    private ListCarEntity listCar;


    private List<ProductCarEntitiy> listProCar = new ArrayList<ProductCarEntitiy>();
    private ProductCarEntitiy listProductCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_car);

        init();
        init1();

        mGrid = (GridView) findViewById(R.id.list_car);
        AdapterLstCar adapter = new AdapterLstCar(this, R.layout.item_list_car,
                listLstCar);
        mGrid.setAdapter(adapter);


        mGrid = (GridView) findViewById(R.id.list_product_car);
        AdapterLstProCar adapter1 = new AdapterLstProCar(this, R.layout.item_list_product_car,
                listProCar);
        mGrid.setAdapter(adapter1);



    }

    public void init() {
        listCar = new ListCarEntity("Máy tính", R.drawable.icon_computer);
        listLstCar.add(listCar);

        listCar = new ListCarEntity("Laptop", R.drawable.icon_laptop);
        listLstCar.add(listCar);

        listCar = new ListCarEntity("Tai nghe", R.drawable.icon_headphone);
        listLstCar.add(listCar);

        listCar = new ListCarEntity("Chuột", R.drawable.icon_computer);
        listLstCar.add(listCar);


        listCar = new ListCarEntity("Phụ kiện", R.drawable.icon_laptop);
        listLstCar.add(listCar);


        listCar = new ListCarEntity("Khác", R.drawable.icon_headphone);
        listLstCar.add(listCar);





    }


    public void init1() {
        listProductCar = new ProductCarEntitiy("Tai nghe HK O0015DK", R.drawable.img_headphone, "HK","6,999,000đ", "3,999,000");
        listProCar.add(listProductCar);

        listProductCar = new ProductCarEntitiy("Tai nghe HK O0015DK", R.drawable.img_headphone2, "HK","", "3,999,000");
        listProCar.add(listProductCar);

        listProductCar = new ProductCarEntitiy("Tai nghe HK O0015DK", R.drawable.img_keyboard, "HK","6,999,000đ", "3,999,000");
        listProCar.add(listProductCar);

        listProductCar = new ProductCarEntitiy("Tai nghe HK O0015DK", R.drawable.img_headphone, "HK","", "3,999,000");
        listProCar.add(listProductCar);

        listProductCar = new ProductCarEntitiy("Tai nghe HK O0015DK", R.drawable.img_headphone2, "HK","6,999,000đ", "3,999,000");
        listProCar.add(listProductCar);

        listProductCar = new ProductCarEntitiy("Tai nghe HK O0015DK", R.drawable.img_keyboard, "HK","", "3,999,000");
        listProCar.add(listProductCar);







    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }






}
