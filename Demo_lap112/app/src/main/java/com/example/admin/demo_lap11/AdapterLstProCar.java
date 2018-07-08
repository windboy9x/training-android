package com.example.admin.demo_lap11;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterLstProCar extends ArrayAdapter<ProductCarEntitiy> {

    private Context context;
    private int resId;
    private List<ProductCarEntitiy> ListProCar;

    public AdapterLstProCar(Context context, int textViewResourceId, List<ProductCarEntitiy> objects) {
        super(context, textViewResourceId, objects);
        this.context = context;
        this.resId = textViewResourceId;
        this.ListProCar = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        AdapterLstProCar.ViewHolder viewHolder = new AdapterLstProCar.ViewHolder();
        if (itemView == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            itemView = inflater.inflate(resId, null);

            viewHolder.imgProCar = (ImageView) itemView
                    .findViewById(R.id.img_lstpro_car);
            viewHolder.lblNsxProCar = (TextView) itemView
                    .findViewById(R.id.nsx_lstpro_car);

            viewHolder.lblNameProCar = (TextView) itemView
                    .findViewById(R.id.name_lstpro_car);

            viewHolder.lblStPriCar = (TextView) itemView
                    .findViewById(R.id.stprice_lstpro_car);
            viewHolder.lblEdPriCar = (TextView) itemView
                    .findViewById(R.id.edprice_lstpro_car);

            itemView.setTag(viewHolder);
        } else {
            viewHolder = (AdapterLstProCar.ViewHolder) itemView.getTag();
        }
        viewHolder.imgProCar
                .setImageResource(ListProCar.get(position).getImgProCar());
        viewHolder.lblNsxProCar.setText(ListProCar.get(position).getNxsProCar());
        viewHolder.lblNameProCar.setText(ListProCar.get(position).getNameProCar());
        viewHolder.lblStPriCar.setText(ListProCar.get(position).getStPricePro());
        viewHolder.lblEdPriCar.setText(ListProCar.get(position).getEdPricePro());

        return itemView;
    }


    private class ViewHolder {
        ImageView imgProCar;
        TextView lblNameProCar;
        TextView lblNsxProCar;
        TextView lblStPriCar;
        TextView lblEdPriCar;

    }
}
