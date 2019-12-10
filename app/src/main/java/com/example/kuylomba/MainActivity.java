package com.example.kuylomba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.kuylomba.adapter.ContestListAdapter;
import com.example.kuylomba.model.Contest;
import com.example.kuylomba.model.ContestsData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String title = "Kuy Lomba";
    private RecyclerView rv;
    private ArrayList<Contest> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv);
        rv.setHasFixedSize(true);

        list.addAll(ContestsData.getListData());
        showRecyclerList();

        setActionBarTitle(title);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                Intent moveIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(moveIntent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    private void showRecyclerList() {
        rv.setLayoutManager(new LinearLayoutManager(this));
        ContestListAdapter contestListAdapter = new ContestListAdapter(list);
        rv.setAdapter(contestListAdapter);

        contestListAdapter.setOnItemClickCallback(new ContestListAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Contest selectedContest) {
                Intent i = new Intent(MainActivity.this, DetailActivity.class);
                i.putExtra(DetailActivity.SELECTED_CONTEST, selectedContest);
                startActivity(i);
            }
        });
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Membaca file menu dan menambahkan isinya ke action bar jika ada.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
