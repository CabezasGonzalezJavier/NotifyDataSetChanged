package com.thedeveloperworldisyours.notifydatasetchanged;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class OnlyOneFragment extends Fragment {

    public OnlyOneFragment() {
        // Required empty public constructor
    }

    public static OnlyOneFragment newInstance() {
        return new OnlyOneFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_only_one, container, false);
        ListView listView = (ListView) view.findViewById(R.id.fragment_only_one_list_view);

        String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
                "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
                "Linux", "OS/2" };

        OnlyOneAdapter adapter = new OnlyOneAdapter(getActivity(),values);
        listView.setAdapter(adapter);
        return view;
    }

}