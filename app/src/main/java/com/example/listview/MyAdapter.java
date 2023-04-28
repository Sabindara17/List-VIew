package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<DataClass> {
    public MyAdapter(@NonNull Context context, ArrayList<DataClass> arrayList) {
        super(context,0, arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View newViewclass = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        DataClass getDataPosition = getItem(position);

        ImageView imageView = newViewclass.findViewById(R.id.iv);
        TextView textVIew = newViewclass.findViewById(R.id.text1);
        TextView testView= newViewclass.findViewById(R.id.text2);

        imageView.setImageResource(getDataPosition.images);
        testView.setText(getDataPosition.text1);
        textVIew.setText(getDataPosition.text2);

        return newViewclass;
    }
}
