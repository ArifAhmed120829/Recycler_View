package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        //Data
        DataModel[] myListData = new DataModel[]{
                new DataModel("Teacher",R.drawable.teacher),
                new DataModel("Student",R.drawable.student),
                new DataModel("Bus_Driver",R.drawable.driver),
                new DataModel("Food service worker",R.drawable.ez1),
                new DataModel("Custodian",R.drawable.principle),
                new DataModel("Teaching assistant",R.drawable.driver),
                new DataModel("Crossing guard",R.drawable.teacher),
                new DataModel("Sports coach",R.drawable.student),
                new DataModel("Academic adviser",R.drawable.ez1),
                new DataModel("Groundskeeper",R.drawable.principle),
                new DataModel("Maintenance technician",R.drawable.student),
                new DataModel("Registrar",R.drawable.driver),
                new DataModel("Academic coordinator",R.drawable.teacher),
                new DataModel("Special education teacher",R.drawable.ez1),
                new DataModel("Versity nurse",R.drawable.principle),
                new DataModel("Webmaster",R.drawable.teacher),
                new DataModel("Guidance counselor",R.drawable.student),
                new DataModel("Athletic director",R.drawable.driver),
                new DataModel("Guidance counselor",R.drawable.ez1),
                new DataModel("Principal",R.drawable.principle),

        };
        //Adapter
        MyAdapter adapter = new MyAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}