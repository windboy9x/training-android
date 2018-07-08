package com.example.admin.demo_lap11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private GridView mGrid;
    private List<ProductPortfolioEntity> listProPortfolio = new ArrayList<ProductPortfolioEntity>();
    private ProductPortfolioEntity proPortfolio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        mGrid = (GridView) findViewById(R.id.gridview_product_portfolio);
        AdapterProPortfolio adapter = new AdapterProPortfolio(this, R.layout.item_product_portfolio,
                listProPortfolio);
        mGrid.setAdapter(adapter);
    }

    public void init() {
        proPortfolio = new ProductPortfolioEntity("Máy ảnh", R.drawable.ic_camera);
        listProPortfolio.add(proPortfolio);

        proPortfolio = new ProductPortfolioEntity("Ô tô", R.drawable.ic_car);
        listProPortfolio.add(proPortfolio);

        proPortfolio = new ProductPortfolioEntity("Máy nghe nhạc", R.drawable.ic_ipod);
        listProPortfolio.add(proPortfolio);

        proPortfolio = new ProductPortfolioEntity("Dụng cụ học tập", R.drawable.ic_pen);
        listProPortfolio.add(proPortfolio);

        proPortfolio = new ProductPortfolioEntity("Giày thể thao", R.drawable.ic_shoes);
        listProPortfolio.add(proPortfolio);

        proPortfolio = new ProductPortfolioEntity("Phần mềm", R.drawable.ic_software);
        listProPortfolio.add(proPortfolio);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


}
