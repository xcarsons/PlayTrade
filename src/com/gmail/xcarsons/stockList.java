package com.gmail.xcarsons;

import android.app.ListActivity;
import android.view.View;
import android.widget.SimpleAdapter;

/**
 * Created by Gwen on 6/13/2014.
 */
public class stockList extends ListActivity
                implements SimpleAdapter.ViewBinder{

    private SimpleAdapter stockList;



    @Override
    public boolean setViewValue(View view, Object o, String s) {
        return false;
    }
}
