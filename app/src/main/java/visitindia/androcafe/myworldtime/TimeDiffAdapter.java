package visitindia.androcafe.myworldtime;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

public class TimeDiffAdapter extends BaseAdapter{
    Context context;
    ArrayList<String> arrayList;


    TextView time;
    public TimeDiffAdapter(FragmentActivity activity, ArrayList<String> arrayList) {
        context=activity;
        this.arrayList=arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null)
        {
            LayoutInflater layoutInflater=LayoutInflater.from(context);
            view=layoutInflater.inflate(R.layout.time_diff_list_row,null);
        }

        TextView cityname=view.findViewById(R.id.textview_city);
        time=view.findViewById(R.id.textview_time);

        cityname.setText(arrayList.get(i));
        setTime(arrayList.get(i));

        //time.setText(""+dateFormat);
        return view;
    }

    private DateFormat setTime(String s) {
        TimeZone timeZone = null;

        //set City codes to get time for respective city
        if(s.equalsIgnoreCase("New Delhi"))
        {
            timeZone=TimeZone.getTimeZone("Asia/Calcutta");
        }
        if(s.equalsIgnoreCase("Mexico City"))
        {
            timeZone=TimeZone.getTimeZone("America/Mexico_City");
        }
        if(s.equalsIgnoreCase("Tokyo")) {
            timeZone = TimeZone.getTimeZone("Asia/Tokyo");
        }
        if(s.equalsIgnoreCase("new york")) {
            timeZone = TimeZone.getTimeZone("America/New_York");
        }
        if(s.equalsIgnoreCase("kabul")) {
            timeZone = TimeZone.getTimeZone("Asia/Kabul");
        }
        if(s.equalsIgnoreCase("seoul")) {
            timeZone = TimeZone.getTimeZone("Asia/Seoul");
        }
        if(s.equalsIgnoreCase("kathmandu"))
        {
            timeZone=TimeZone.getTimeZone("Asia/Kathmandu");
        }
        if(s.equalsIgnoreCase("islamabad"))
        {
            timeZone=TimeZone.getTimeZone("Asia/Karachi");
        }
        if(s.equalsIgnoreCase("Bangkok"))
        {
            timeZone=TimeZone.getTimeZone("Asia/Bangkok");
        }
        if(s.equalsIgnoreCase("beijing"))
        {
            timeZone=TimeZone.getTimeZone("Asia/Shanghai");
        }
        if(s.equalsIgnoreCase("Cairo"))
        {
            timeZone=TimeZone.getTimeZone("Africa/Cairo");
        }
        if(s.equalsIgnoreCase("paris"))
        {
            timeZone=TimeZone.getTimeZone("Europe/Paris");
        }
        if(s.equalsIgnoreCase("london"))
        {
            timeZone=TimeZone.getTimeZone("Europe/London");
        }
        if(s.equalsIgnoreCase("Kuala Lumpur"))
        {
            timeZone=TimeZone.getTimeZone("Asia/Kuala_Lumpur");
        }
        if(s.equalsIgnoreCase("dhaka"))
        {
            timeZone=TimeZone.getTimeZone("Asia/Dhaka");
        }
        if(s.equalsIgnoreCase("colombo"))
        {
            timeZone=TimeZone.getTimeZone("Asia/Colombo");
        }
        if(s.equalsIgnoreCase("dubai"))
        {
            timeZone=TimeZone.getTimeZone("Asia/Dubai");
        }
        if(s.equalsIgnoreCase("berlin"))
        {
            timeZone=TimeZone.getTimeZone("Europe/Berlin");
        }
        if(s.equalsIgnoreCase("moscow"))
        {
            timeZone=TimeZone.getTimeZone("Europe/Moscow");
        }
        if(s.equalsIgnoreCase("baghdad"))
        {
            timeZone=TimeZone.getTimeZone("Asia/Baghdad");
        }
        if(s.equalsIgnoreCase("canberra"))
        {
            timeZone=TimeZone.getTimeZone("Australia/Canberra");
        }


        final Date now = new Date();
        final DateFormat format = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);

        if(timeZone!=null) {
            format.setTimeZone(timeZone);
            String str=""+format.format(now);
            System.out.println(""+format.format(now));
            time.setText(""+str.substring(str.length()-8,str.length()));
        }

        return  format;
    }


}
