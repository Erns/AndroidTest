//Custom made Java file


package com.example.aaron.androidtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aaron.androidtest.R;

class MyAdapter extends ArrayAdapter<String> {


    public MyAdapter(Context context, String[] values) {
        super(context, R.layout.row_layout2, values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater theInflater = LayoutInflater.from(getContext());

        View theView = theInflater.inflate(R.layout.row_layout2, parent, false);
        String testString = getItem(position);

        TextView theTextView = (TextView) theView.findViewById(R.id.textView2);

        theTextView.setText(testString);

        //Change image
        //ImageView theImageView = (ImageView) theView.findViewById(R.id.imageView2);
        //theImageView.setImageResource(R.drawable.ic_drawer);

        return theView;

    }
}