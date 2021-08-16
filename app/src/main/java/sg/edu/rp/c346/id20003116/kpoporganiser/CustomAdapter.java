package sg.edu.rp.c346.id20003116.kpoporganiser;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Group> groupList;

    public CustomAdapter(Context context, int resource, ArrayList<Group> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        groupList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        ImageView ivGroup = rowView.findViewById(R.id.imageView);
        TextView tvKorean = rowView.findViewById(R.id.koreanName);
        TextView tvEnglish = rowView.findViewById(R.id.englishName);
        TextView tvChinese = rowView.findViewById(R.id.chineseName);

        Group currentItem = groupList.get(position);
        tvKorean.setText(currentItem.getKoreanName());
        tvEnglish.setText(currentItem.getEnglishName());
        tvChinese.setText(currentItem.getChineseName());

        String group = currentItem.getEnglishName();
        if (group == "Bangtan Sonyeondan (BTS)") {
            ivGroup.setImageResource(R.drawable.bts_group_photo);
        } else if (group == "BlackPink") {
            ivGroup.setImageResource(R.drawable.blackpink_group_photo);
        } else if (group == "aespa") {
            ivGroup.setImageResource(R.drawable.aespa_group_photo);
        } else if (group == "EXO") {
            ivGroup.setImageResource(R.drawable.exo_group_photo);
        } else if (group == "GFRIEND") {
            ivGroup.setImageResource(R.drawable.gfriend_group_photo);
        } else if (group == "Girls' Generation") {
            ivGroup.setImageResource(R.drawable.girls_generation_group_photo);
        } else if (group == "Red Velvet") {
            ivGroup.setImageResource(R.drawable.red_velvet_group_photo);
        } else if (group == "SuperM") {
            ivGroup.setImageResource(R.drawable.superm_group_photo);
        }

        return rowView;
    }
}
