package com.owishassan.onlineshoppingt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MShopping extends AppCompatActivity {


    ArrayList<ItemInfo> items_Data = new ArrayList<>();

    ItemsListAdabter iLA;

    Button go_To_Bag_Page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mshopping);

        for(int i =0;i<10;i++)
            items_Data.add(new ItemInfo(0, i + "a",
                    i + "b", i + .0, i + .0));

        ListView items_List = findViewById(R.id.Item_List);

        iLA = new ItemsListAdabter(this,items_Data);
        items_List.setAdapter(iLA);

        go_To_Bag_Page = findViewById(R.id.Bag_Page);

        go_To_Bag_Page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), My_Bag.class);
                startActivity(i);
            }
        });
    }
}
