package com.example.a2hanj43.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

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

        TextView tvlo = (TextView)findViewById(R.id.lon);
        EditText etlo = (EditText)findViewById(R.id.lon);
        double longitude = Double.parseDouble(etlo.getText().toString());

        TextView tvla = (TextView)findViewById(R.id.lat);
        EditText etla = (EditText)findViewById(R.id.lat);
        double latitude = Double.parseDouble(etla.getText().toString());

        bundle.putDouble("com.example.Latitude",latitude);
        bundle.putDouble("com.example.Longitude",longitude);
        intent.putExtras(bundle);
        setResult(RESULT_OK,intent);
        finish();
    }


}
