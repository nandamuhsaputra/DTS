package com.bram.dts;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class CustomAdapter extends BaseAdapter {
    Integer[] tmp;
    Context context;
    String[] data;
    LayoutInflater inflater;

    public CustomAdapter(Context context, String[] data) {
        this.context = context;
        this.data = data;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.listgrid,null);
        final Integer asdas = i;
        final TextView abjad = view.findViewById(R.id.textID);
        abjad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abjad.setSelected(true);
                Toast.makeText(context, "coba"+asdas, Toast.LENGTH_SHORT).show();
            }
        });
        abjad.setText(data[i]);
        return view;

    }
}
