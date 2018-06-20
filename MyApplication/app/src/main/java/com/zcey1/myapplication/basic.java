package com.zcey1.myapplication;
import android.app.Fragment;
import android.support.v4.app.*;
import android.support.v4.view.*;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class basic extends android.support.v4.app.Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.basic, container, false);
        return rootView;
    }
}
