package com.example.aqua.movieratings;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rvmovies);
        linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        MovieAdapter adapter=new MovieAdapter(MainActivity.this);
        recyclerView.setAdapter(adapter);

        NetworkTask networkTask=new NetworkTask();
        networkTask.execute();
    }
}


class NetworkTask extends AsyncTask{

    @Override
    protected Object doInBackground(Object[] params) {


        return null;
    }
}