package com.example.georgevio.sqlinew;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class C extends ArrayAdapter<U> {

    private LayoutInflater mInflater;
    private ArrayList<U> users;
    private int mViewResourceId;

    public C(Context context, int textViewResourceId, ArrayList<U> users) {
        super(context, textViewResourceId, users);
        this.users = users;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mViewResourceId = textViewResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(mViewResourceId, null);

        U user = users.get(position);

        if (user != null) {
            TextView Name = (TextView) convertView.findViewById(R.id.textName);
            TextView Phone = (TextView) convertView.findViewById(R.id.textPhone);
            TextView Street = (TextView) convertView.findViewById(R.id.textStreet);
            TextView Place = (TextView) convertView.findViewById(R.id.textPlace);
            TextView Email = (TextView) convertView.findViewById(R.id.textEmail);
            if (Name != null) {
                Name.setText(user.getName());
            }
            if (Phone != null) {
                Phone.setText((user.getPhone()));
            }
            if (Street != null) {
                Street.setText((user.getStreet()));
            }
            if (Place != null) {
                Place.setText((user.getPlace()));
            }
            if (Email != null) {
                Email.setText((user.getEmail()));
            }
        }

        return convertView;
    }
}