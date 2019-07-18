package com.chavez.mrjuerga.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.chavez.mrjuerga.R;
import com.chavez.mrjuerga.adapters.ProductAdapter;
import com.chavez.mrjuerga.models.ProductoReal;

import java.util.ArrayList;

public class ReservaListActivity extends AppCompatActivity {
    ListView listViewProducts;

    ProductAdapter itemsAdapter;


    ArrayList<ProductoReal> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserva_list);



        listViewProducts = (ListView) findViewById(R.id.listViewProducts);

        items = ProductoReal.getData();



        itemsAdapter =
                new ProductAdapter(this, items);

        listViewProducts.setAdapter(itemsAdapter);

        listViewProducts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapter, View v, int position, long id) {

            }
        });
    }
    @Override
    public void onResume(){
        super.onResume();
       /* Intent myIntent = getIntent();
        String statusRequest = myIntent.getStringExtra("status");
        if (statusRequest != null && !statusRequest.isEmpty() ) {
            Toast.makeText(this,"Oops", Toast.LENGTH_SHORT).show();
        }*/
        // put your code here...

    }
    public void refreshList(){
        if ( itemsAdapter!= null ) {
            itemsAdapter.notifyDataSetChanged();
        }
    }
    public void selectProduct(int position) {

    }
}


