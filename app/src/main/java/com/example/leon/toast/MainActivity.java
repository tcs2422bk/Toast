package com.example.leon.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void bt1(View v){

        //  toast.setDuration(duration);         set during time
        //  toast.setGravity(gravity,x,y);      set toast location

        Toast toast = Toast.makeText(this,"One Two Three~",Toast.LENGTH_SHORT); //  return toast
        toast.show();
    }
    public void bt2(View v){

        Toast toast = Toast.makeText(this,"Change location : Toast",Toast.LENGTH_SHORT); //  return toast
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }
    public void bt3(View v){

        Toast toast = Toast.makeText(this,"Image : Toast",Toast.LENGTH_SHORT); //  return toast
        LinearLayout toast_layout = (LinearLayout) toast.getView();
        ImageView iv = new ImageView(this);
        iv.setImageResource(R.drawable.cat);
        toast_layout.addView(iv,0);     //  toast_layout.addView(iv,text_location);

        toast.show();
    }
    public void bt4(View v){
        //      self define Toast   LayoutInflate 像是氣球  包著View 的內容
        LayoutInflater inflater = LayoutInflater.from(this);
        View image_layout = inflater.inflate(R.layout.image_layout,null);
        Toast toast = new Toast(this);
        toast.setView(image_layout);
        toast.show();
    }
}
