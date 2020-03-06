package com.owishassan.onlineshoppingt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class Item_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item__page);

        String Data = getIntent().getStringExtra("ItemData");

        ArrayList<String> the_DATA = new ArrayList(Arrays.asList(Data.split(",")));


        final ItemInfo theItem = new ItemInfo(Integer.parseInt(the_DATA.get(0)),the_DATA.get(1),the_DATA.get(2),
                Double.parseDouble(the_DATA.get(3)),Double.parseDouble(the_DATA.get(4)));

        TextView item_Name = findViewById(R.id.Item_Name);
        TextView item_Des = findViewById(R.id.Item_Description);
        TextView item_Price = findViewById(R.id.Item_Price);
        TextView item_Rate = findViewById(R.id.Item_Rate);


        item_Name.setText(theItem.getItem_Name());
        item_Des.setText(theItem.getItem_Description());
        item_Price.setText(theItem.getItem_Price() + "");
        item_Rate.setText(theItem.getItem_Rate() + "");

        Button back_To_Home = findViewById(R.id.Page_Back);
        back_To_Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), MShopping.class);
                startActivity(i);
            }
        });

        Button add_The_Item = findViewById(R.id.Add_The_Item);
        add_The_Item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Item_Page.this, "تمت الاضافة", Toast.LENGTH_SHORT).show();
                saveData(theItem);
            }
        });

    }

    public void saveData(ItemInfo II) {

        String Data;

        String loadData = getSharedPreferences("A", MODE_PRIVATE).getString("B", "");

        if(loadData == "")
            Data = II.getItem_Photo()+"," + II.getItem_Name()+"," + II.getItem_Description()+"," + II.getItem_Price() +","+ II.getItem_Rate();
        else
            Data = loadData + "-" + II.getItem_Photo()+"," + II.getItem_Name()+"," + II.getItem_Description()+"," + II.getItem_Price() +","+ II.getItem_Rate();


        SharedPreferences X = getSharedPreferences("A", MODE_PRIVATE);
        SharedPreferences.Editor Ed = X.edit();

        Ed.putString("B", Data);
        Ed.apply();
        //Toast.makeText(Data_Page.this, "Saved", Toast.LENGTH_SHORT).show();
    }

}