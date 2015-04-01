package com.example.jin.searchyou_version11;


import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyListFragment extends Fragment {


    private GridView gridListView;
    private List<HashMap<String, String>> data;



    public MyListFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        //GridView gridView =
        return view;
    }

    gridListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            //show recruitment information
            Intent openNewActivity = new Intent(getActivity().getApplicationContext(), RecruInfoActivity.class);
            startActivity(openNewActivity);
        }
    });

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        findVidwByIds();
        fillData();
        SimpleAdapter sa = new SimpleAdapter(getActivity(), data, R.layout.item_main, new String[]{"key", "title_1"}, new int[]{R.id.key, R.id.title_1});

        gridListView.setAdapter(sa);


    }

    public void findVidwByIds() {
        gridListView = (GridView) getActivity().findViewById(R.id.list_gridView);
    }

    public void fillData() {

        data = new ArrayList<HashMap<String, String>>();


        HashMap<String, String> map = new HashMap<String, String>();
        map.put("key", "Systems Analyst");
        map.put("title_1", "Baidu");
        data.add(map);

        //map.clear();
        map = new HashMap<String, String>();
        map.put("key", "Project Manager");
        map.put("title_1", "Tencent");
        data.add(map);

        //map.clear();
        map = new HashMap<String, String>();
        map.put("key", "Software Designer");
        map.put("title_1", "Google");
        data.add(map);

        //map.clear();
        map = new HashMap<String, String>();
        map.put("key", "Programmer");
        map.put("title_1", "Baidu");
        data.add(map);

    }




}
