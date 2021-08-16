package sg.edu.rp.c346.id20003116.kpoporganiser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MemberActivity extends AppCompatActivity {

    TextView groupName;
    ListView lv;
    ArrayList<GroupMember> alGroupMemberList;
    CustomAdapter1 caGroupMember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);

        groupName = findViewById(R.id.groupName);
        lv = findViewById(R.id.listView);

        alGroupMemberList = new ArrayList<>();

        

        GroupMember jungKook = new GroupMember("BTS", "전정국", "Jeon Jung-kook", )
        GroupMember gfriend = new GroupMember
        GroupMember aespa = new GroupMember
        alGroupMemberList.add(jungKook);
        alGroupMemberList.add(gfriend);
        alGroupMemberList.add(aespa);

        caGroupMember = new CustomAdapter1(this, R.layout.rowgroup, alGroupMemberList);
        lv.setAdapter(caGroupMember);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MemberActivity.this, StatsActivity.this);
                startActivity(intent);
            }
        });
    }
}