package com.gita.chitwanbazar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import static com.gita.chitwanbazar.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {


    ArrayList<MyData> list;
    private RecyclerView rv;
    private RecyclerView.Adapter adapter;
    ArrayAdapter<String> adapter2;
    private RecyclerView.LayoutManager layoutmanager;
    private RecyclerView.LayoutManager layoutManager1;
    private RecyclerView.LayoutManager layoutManager2;
    ListView gv;
    Spinner sp;
    TextView tv;
    ArrayAdapter<String> adapter1;
    String[] list1={"Apprels & Accessories","Automobiles","Books & Magzine","Computer & Pheripherials","Computer & Electronic","Games & Fitness","Mobile & Accessories"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        rv = (RecyclerView) findViewById(R.id.recycler);
         gv=(ListView) findViewById(R.id.gridview);
        sp=(Spinner)findViewById(R.id.spinner);
        tv=(TextView)findViewById(R.id.hm) ;
        tv.setSelected(true);
        list = new ArrayList<MyData>();


        for (int i = 0; i < Detail.name.length; i++) {
            list.add(new MyData(Detail.image[i],
                    Detail.name[i],
                    Detail.price[i]));
        }
        CustomAdapter adapter = new CustomAdapter(list);
        layoutmanager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);


        rv.setLayoutManager(layoutmanager);
        rv.setAdapter(adapter);
      adapter1=new ArrayAdapter<String>(this,R.layout.listview_design,R.id.tlist,list1);
        gv.setAdapter(adapter1);


        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position){
                    case 0:
                        startActivity(new Intent(getApplicationContext(),Grid1Activity.class));
                }

            }

                  });



    }

  /*  @Override

    public boolean onCreateOptionsMenu(Menu menu) {

        //getMenuInflater().inflate(R.menu.menu, menu);
        getMenuInflater().inflate(,menu);
        return true;

    }
    */


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.senu_tab, menu);
        return super.onCreateOptionsMenu(menu);
    }
    /*@Override
    public boolean onOptionsItemSelected (Menu item){
        switch (item.getItem()) {
            case R.id.home:
                break;
            case R.id.register:
                break;
            case R.id.login:
                break;
            case R.id.heip:
                break;

        }
        return true;
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                startActivity(new Intent(getApplicationContext(),MainActivity.class));

                break;
            case R.id.register:
                startActivity(new Intent(getApplicationContext(),RegisterActivity.class));
                break;
            case R.id.login:
                startActivity(new Intent(getApplicationContext(),RegisterActivity.class));
                break;
            case R.id.help:
                break;
        }

            return super.onOptionsItemSelected(item);
    }
}
