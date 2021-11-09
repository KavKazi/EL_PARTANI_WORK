package com.example.listviewformyapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfessionAdapter extends BaseAdapter {

    Context context;
    String[] professionsName;
    int[]professionImage;

    LayoutInflater inflater;

    public ProfessionAdapter(Context context, String[] professionsName, int[] professionImage) {
        this.context = context;
        this.professionsName = professionsName;
        this.professionImage = professionImage;
    }

    @Override
    public int getCount() {
        return professionsName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
        if(convertView==null) {
            convertView = inflater.inflate(R.layout.grid_profession_item, null);
        }

        ImageView imageView = convertView.findViewById(R.id.profession_image);
        TextView textView = convertView.findViewById(R.id.profession_name);

        imageView.setImageResource(professionImage[position]);
        textView.setText(professionsName[position]);
        return convertView;
    }
}
