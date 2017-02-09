package com.example.a2hanj43.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class SetLocationActivity extends Activity implements OnClickListener {

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_location);

        Button search = (Button)findViewById(R.id.searchLatLong);
        search.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        Intent intent = new Intent();
        Bundle bundle=new Bundle();
        double latitude = 0;
        double longitude = 0;

        bundle.putDouble("com.example.Latitude",latitude);
        bundle.putDouble("com.example.Longitude",longitude);
        intent.putExtras(bundle);
        setResult(RESULT_OK,intent);
        finish();
    }


}
