package com.example.elkholy.task_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class First_Activity extends AppCompatActivity {
    Expandble_list_adapter expandble_list_adapter;
    ExpandableListView expandableListView;
    List<group> list_Header;

    HashMap<List<group>, List<Items>> list_Items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_);
        list_Header = new ArrayList<group>();
        list_Items = new HashMap<List<group>, List<Items>>();

l1:
        list_Header.add(new group("main", R.drawable.addbutton));
        list_Header.add(new group("Sub main", R.drawable.addbutton));

        List<Items> main = new ArrayList<Items>();
        main.add(new Items("Add", R.drawable.addbutton));
        main.add(new Items("question", R.drawable.question));
        main.add(new Items("Extend", R.drawable.extendbutton));

        List<Items> submain = new ArrayList<Items>();
        submain.add(new Items("facebook", R.drawable.facebook));
        submain.add(new Items("phone", R.drawable.phone));

        list_Items.put(list_Header.get(0), main);
        list_Items.put(list_Header.get(1), submain);

        expandble_list_adapter = new Expandble_list_adapter(getApplicationContext(), list_Header, list_Items);
        expandableListView = (ExpandableListView) findViewById(R.id.expandable_list);
        expandableListView.setAdapter(expandble_list_adapter);


        expandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {

                if (groupPosition == 0) {
                    if (list_Header.get(0).imagurl == R.drawable.addbutton) {
                        list_Header.get(0).imagurl = R.drawable.extendbutton;
                    } else {
                        list_Header.get(0).imagurl = R.drawable.addbutton;
                    }
                }
                if (groupPosition == 1) {
                    if (list_Header.get(1).imagurl == R.drawable.addbutton) {
                        list_Header.get(1).imagurl = R.drawable.extendbutton;
                    } else {
                        list_Header.get(1).imagurl = R.drawable.addbutton;
                    }
                }
                return false;

            }
        });

    }
}
