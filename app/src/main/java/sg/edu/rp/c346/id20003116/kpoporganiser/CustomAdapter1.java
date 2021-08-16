package sg.edu.rp.c346.id20003116.kpoporganiser;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter1 extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<GroupMember> groupMemberList;

    public CustomAdapter1(Context context, int resource, ArrayList<GroupMember> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        groupMemberList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        TextView groupName = rowView.findViewById(R.id.groupName);
        ImageView ivGroup = rowView.findViewById(R.id.imageView);
        TextView tvKorean = rowView.findViewById(R.id.koreanName);
        TextView tvEnglish = rowView.findViewById(R.id.englishName);
        TextView tvChinese = rowView.findViewById(R.id.chineseName);

        GroupMember currentItem = groupMemberList.get(position);
        groupName.setText(currentItem.getGroupName());
        tvKorean.setText(currentItem.getKoreanName());
        tvEnglish.setText(currentItem.getEnglishName());
        tvChinese.setText(currentItem.getChineseName());

        return rowView;
    }
}