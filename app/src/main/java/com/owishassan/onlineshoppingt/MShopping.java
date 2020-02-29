package com.owishassan.onlineshoppingt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MShopping extends AppCompatActivity {

    ListView items_List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mshopping);

        items_List = findViewById(R.id.Item_List);
    }
}
