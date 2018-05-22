package com.example.uuzaz.daily_note_1;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fragment_Plan extends android.support.v4.app.Fragment {

    ArrayAdapter<String> mTaskAdapter;

    public Fragment_Plan() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_plan, container, false);

        //Create the fake data
        String[] fakeData = {
                "08:00~09:00", "09:00~10:00", "10:00~11:00", "11:00~12:00", "12:00~13:00", "13:00~14:00", "14:00~15:00",
                "15:00~16:00", "16:00~17:00", "17:00~18:00", "18:00~19:00", "19:00~20:00", "20:00~21:00", "21:00~22:00",
                "22:00~23:00", "23:00~24:00", "24:00~01:00", "01:00~02:00", "02:00~03:00", "03:00~04:00", "04:00~05:00",
                "05:00~06:00", "06:00~07:00", "07:00~08:00"
        };
        List<String> tasks = new ArrayList<String>(Arrays.asList(fakeData));

        //Create the ArrayAdapter by specifying context, "how" (layout),"where" (textview), and " what" (data)
        mTaskAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_task,
                R.id.list_item_task_textview,
                tasks);

        //Still need to bind adapter to the ListView
        ListView listView = (ListView) rootview.findViewById(R.id.listview_tasks);
        listView.setAdapter(mTaskAdapter);

        return rootview;
    }
}

