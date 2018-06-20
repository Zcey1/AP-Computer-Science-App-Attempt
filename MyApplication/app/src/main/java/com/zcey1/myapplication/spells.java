package com.zcey1.myapplication;
import android.app.Fragment;
import android.support.v4.app.*;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.*;
import android.widget.TextView;

public class spells extends android.support.v4.app.Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.spells, container, false);
        return rootView;
    }
}
