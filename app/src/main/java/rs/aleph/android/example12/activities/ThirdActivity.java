package rs.aleph.android.example12.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import rs.aleph.android.example12.R;

public class ThirdActivity extends Activity {



    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        // setContentView method draws UI
        setContentView(R.layout.activity_third);
        Toast toast = Toast.makeText(getBaseContext(), "ThirdActivity.onCreate()", Toast.LENGTH_SHORT);
        toast.show();
    }

    protected void onStart(){
        super.onStart();

        Toast toast = Toast.makeText(getBaseContext(), "ThirdActivity.onStart()", Toast.LENGTH_SHORT);
        toast.show();

    }

    protected void onRestart() {

        super.onRestart();
    }

    @Override
    protected void onResume() {

        super.onResume();


    }
    @Override
    protected void onPause() {

        super.onPause();
    }

    @Override
    protected void onStop() {

        super.onStop();

    }

    @Override
    protected void onDestroy() {

        super.onDestroy();

    }

}
