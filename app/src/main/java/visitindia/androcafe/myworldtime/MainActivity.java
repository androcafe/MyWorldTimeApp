package visitindia.androcafe.myworldtime;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    TimeDiffAdapter timeDiffAdapter;

    ArrayList<String> arrayList=new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //  getActionBar().setDisplayShowHomeEnabled(true);

        listView=findViewById(R.id.listview_time_diff);

        String[] cityname=getResources().getStringArray(R.array.time_diff_array);

        for(int i=0;i<cityname.length;i++)
        {
            arrayList.add(cityname[i]);
        }

        timeDiffAdapter=new TimeDiffAdapter(this,arrayList);

        listView.setAdapter(timeDiffAdapter);
    }
}
