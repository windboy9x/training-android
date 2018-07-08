package com.example.admin.demo_lap11;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterLstCar extends ArrayAdapter<ListCarEntity> {
    private Context context;
    private int resId;
    private List<ListCarEntity> listLstCar;

    public AdapterLstCar(Context context, int textViewResourceId, List<ListCarEntity> objects) {
        super(context, textViewResourceId, objects);
        this.context = context;
        this.resId = textViewResourceId;
        this.listLstCar = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        AdapterLstCar.ViewHolder viewHolder = new AdapterLstCar.ViewHolder();
        if (itemView == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            itemView = inflater.inflate(resId, null);

            viewHolder.imgLstCar = (ImageView) itemView
                    .findViewById(R.id.imgLstCar);
            viewHolder.lbNameLstCar = (TextView) itemView
                    .findViewById(R.id.nameLstCar);

            itemView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) itemView.getTag();
        }
        viewHolder.imgLstCar
                .setImageResource(listLstCar.get(position).getImgListCar());
        viewHolder.lbNameLstCar.setText(listLstCar.get(position).getNameListCar());

        return itemView;
    }


    private class ViewHolder {
        ImageView imgLstCar;
        TextView lbNameLstCar;

    }
}
