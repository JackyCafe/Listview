package com.ian.mylistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class ListAdapter extends BaseAdapter {
    private List<String> datas;
    private LayoutInflater inflater;
    public ListAdapter(Context c, List<String> datas){
        this.datas = datas;
        inflater = LayoutInflater.from(c);
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public Object getItem(int i) {
        return datas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = inflater.inflate(R.layout.activity_item,viewGroup,false);
        TextView tv = v.findViewById(R.id.tv);
        tv.setText(datas.get(i));
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view,datas.get(i), BaseTransientBottomBar.LENGTH_LONG).show();
            }
        });
        return v;
    }
}