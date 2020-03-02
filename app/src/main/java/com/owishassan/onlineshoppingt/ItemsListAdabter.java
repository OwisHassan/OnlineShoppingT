package com.owishassan.onlineshoppingt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemsListAdabter  extends BaseAdapter {

    Context c;
    ArrayList<ItemInfo> items_Data;

    public ItemsListAdabter(Context c, ArrayList<ItemInfo> items_Data) {
        this.c = c;
        this.items_Data = items_Data;
    }

    @Override
    public int getCount() {
        return items_Data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null)
            convertView = LayoutInflater.from(c).inflate(R.layout.items,null,false);

        TextView item_Name = convertView.findViewById(R.id.Item_Name);
        TextView item_Des = convertView.findViewById(R.id.Item_Description);
        TextView item_Price = convertView.findViewById(R.id.Item_Price);
        TextView item_Rate = convertView.findViewById(R.id.Item_Rate);

        item_Name.setText(items_Data.get(position).getItem_Name());
        item_Des.setText(items_Data.get(position).getItem_Description());
        item_Price.setText(items_Data.get(position).getItem_Price().toString());
        item_Rate.setText(items_Data.get(position).getItem_Rate().toString());

        return convertView;
    }

}
