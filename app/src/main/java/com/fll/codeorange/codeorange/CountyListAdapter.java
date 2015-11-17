package com.fll.codeorange.codeorange;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rjf5742 on 15-10-02.
 */
public class CountyListAdapter extends ArrayAdapter<County> {
    public CountyListAdapter(Context context, int resource) {
        super(context, resource);
    }

    public CountyListAdapter(Context context, int resource, List<County> items)
    {
        super(context, resource, items);
    }

    public CountyListAdapter(Context context, int layout, int textview, List<County> items) {
        super(context, layout, textview, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        final County county = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.county, parent, false);
        }

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), CountyDetails.class);
            intent.putExtra("county", county);
            getContext().startActivity(intent);
            }
        });
        // Lookup view for data population
        TextView countyName = (TextView) convertView.findViewById(R.id.adapterCountyTextView);
        countyName.setText(county.getName());
        // Return the completed view to render on screen
        return convertView;
    }
}
