package com.owishassan.onlineshoppingt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class My_Bag extends AppCompatActivity {

    ListView items_List;

    ArrayList<ItemInfo> my_Items_Data = new ArrayList<>();

    ItemsListAdabter iLA;

    Button back_To_Home_Page;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my__bag);

        for(int i =0;i<3;i++)
            my_Items_Data.add(new ItemInfo(0, i + "a",
                    i + "b", i + .0, i + .0));

        items_List = findViewById(R.id.Item_Bag_List);

        iLA = new ItemsListAdabter(this,my_Items_Data);

        items_List.setAdapter(iLA);

        back_To_Home_Page = findViewById(R.id.Home_Page);
        back_To_Home_Page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), MShopping.class);
                startActivity(i);
            }
        });

    }
}
