package com.example.admin.demo_lap11;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class AdapterProPortfolio extends ArrayAdapter<ProductPortfolioEntity> {
    private Context context;
    private int resId;
    private List<ProductPortfolioEntity> listProPortfolio;

    public AdapterProPortfolio(Context context, int textViewResourceId, List<ProductPortfolioEntity> objects) {
        super(context, textViewResourceId, objects);
        this.context = context;
        this.resId = textViewResourceId;
        this.listProPortfolio = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        ViewHolder viewHolder = new ViewHolder();
        if (itemView == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            itemView = inflater.inflate(resId, null);

            viewHolder.imgProPortfolio = (ImageView) itemView
                    .findViewById(R.id.imgProPortfolio);
            viewHolder.lbNameProPortfolio = (TextView) itemView
                    .findViewById(R.id.nameProPortfolio);

            itemView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) itemView.getTag();
        }
        viewHolder.imgProPortfolio
                .setImageResource(listProPortfolio.get(position).getImgProductPortfolio());
        viewHolder.lbNameProPortfolio.setText(listProPortfolio.get(position).getNameProductPortfolio());

        return itemView;
    }


    private class ViewHolder {
        ImageView imgProPortfolio;
        TextView lbNameProPortfolio;

    }
}
