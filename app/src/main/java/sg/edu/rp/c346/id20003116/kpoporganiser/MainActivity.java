package sg.edu.rp.c346.id20003116.kpoporganiser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowId;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SearchView sv;
    ListView lv;
    ArrayList<Group> alGroupList;
    CustomAdapter caGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sv = findViewById(R.id.searchView);
        lv = findViewById(R.id.listView);

        alGroupList = new ArrayList<>();
        Group bts = new Group("방탄소년단", "Bangtan Sonyeondan (BTS)", "防弹少年团");
        Group gfriend = new Group("여자친구", "GFRIEND", null);
        Group aespa = new Group("에스파", "aespa", null);
        alGroupList.add(bts);
        alGroupList.add(gfriend);
        alGroupList.add(aespa);

        caGroup = new CustomAdapter(this, R.layout.rowgroup, alGroupList);
        lv.setAdapter(caGroup);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, MemberActivity.class);
                startActivity(intent);
            }
        });
    }
}