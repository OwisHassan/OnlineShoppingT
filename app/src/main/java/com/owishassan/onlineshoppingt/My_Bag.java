package com.owishassan.onlineshoppingt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class My_Bag extends AppCompatActivity {

    ListView items_List;

    ArrayList<ItemInfo> my_Items_Data = new ArrayList<>();

    ItemsListAdabter iLA;

    Button back_To_Home_Page;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my__bag);

        String theSavedData = "";
        try{
            theSavedData = getSharedPreferences("A", MODE_PRIVATE).getString("B", "");
        }catch (Exception e){}

        ArrayList<String> A = new ArrayList<>();

        if(theSavedData != "")
            A = new ArrayList(Arrays.asList(theSavedData.split("-")));

        for(int i =0;i<A.size();i++){
            ArrayList<String> B = new ArrayList(Arrays.asList(A.get(i).split(",")));
            my_Items_Data.add(new ItemInfo(Integer.parseInt(B.get(0)),B.get(1),B.get(2),Double.parseDouble(B.get(3)),Double.parseDouble(B.get(4))));
        }


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
