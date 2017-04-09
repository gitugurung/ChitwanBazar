package com.gita.chitwanbazar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class Grid1Activity extends AppCompatActivity {
    String[] name1={"Baby & Children Accessories","Men Apprel","Sucglasses","Watches","Women's Apparel"};
    String[]name2={"ray","pqy"};
    ListView lv;
    Spinner sp;
    TextView tv;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid1);
        lv=(ListView)findViewById(R.id.list2);
        sp=(Spinner)findViewById(R.id.spinner2);
        tv=(TextView)findViewById(R.id.text);
        adapter=new ArrayAdapter<String>(this,R.layout.spinner,R.id.text,name1);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 2:
                        final ArrayAdapter adapter2=new ArrayAdapter<>(getApplicationContext(),R.layout.app,R.id.name3,name2);
                       sp.setAdapter(adapter2);



                }
            }
        });


    }
}
