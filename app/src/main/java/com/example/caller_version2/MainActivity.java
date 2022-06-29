package com.example.caller_version2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        history_table db =history_table.get_instance(getBaseContext());
        db.open();
        history per =new history(1,"mas","01095623040","5 jul");
        boolean x=db.insert(per);
        Toast.makeText(getBaseContext(),x+"",Toast.LENGTH_SHORT).show();



        /*ArrayList<person> per2=db.select_by_phone("01095623040");
        Toast.makeText(getBaseContext(),per2.size()+"",Toast.LENGTH_LONG).show();
        for (int i=0;i<per2.size();i++)
        Toast.makeText(getBaseContext(),per2.get(i).getName(),Toast.LENGTH_LONG).show();*/
        db.close();
    }
}