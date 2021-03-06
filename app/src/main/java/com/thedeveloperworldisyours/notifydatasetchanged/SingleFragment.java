package com.thedeveloperworldisyours.notifydatasetchanged;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


public class SingleFragment extends Fragment implements AdapterView.OnItemClickListener {

    SingleAdapter mAdapter;

    public SingleFragment() {
        // Required empty public constructor
    }

    public static SingleFragment newInstance() {
        return new SingleFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_single, container, false);
        ListView listView = (ListView) view.findViewById(R.id.fragment_only_one_list_view);

        String[] values = new String[]{"Android", "iPhone", "WindowsMobile",
                "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
                "Linux", "OS/2", "symbian"};

        mAdapter = new SingleAdapter(getActivity(), values);
        listView.setAdapter(mAdapter);
        listView.setOnItemClickListener(this);
        return view;
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        mAdapter.setSelectedIndex(position);
        mAdapter.notifyDataSetChanged();
    }
}
