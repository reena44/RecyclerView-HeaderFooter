package com.example.parsaniahardik.recyclerviewheaderfooter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private HFAdapter hfAdapter;

    private ArrayList<HeaderModel> headerModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);

        headerModelArrayList = new ArrayList<>();
        dataSet();

        hfAdapter = new HFAdapter(this,headerModelArrayList);
        recyclerView.setAdapter(hfAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));


    }

    private void dataSet(){

        for (int i = 0; i < 18; i++ ){

            if (i == 0){

                HeaderModel headerModel= new HeaderModel();
                headerModel.setViewType("header");
                headerModelArrayList.add(headerModel);

            }else if( i == 17){
                HeaderModel headerModel= new HeaderModel();
                headerModel.setViewType("footer");
                headerModelArrayList.add(headerModel);

            }else {
                HeaderModel headerModel= new HeaderModel();
                headerModel.setViewType("normal");
                headerModel.setText("Item Number : "+i);
                headerModelArrayList.add(headerModel);
            }

        }

    }

}
