package rs.aleph.android.example12.activities.activity.aktivites;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import rs.aleph.android.example12.R;
import rs.aleph.android.example12.activities.activity.aktivites.model.Jelo;
import rs.aleph.android.example12.activities.activity.aktivites.model.Kategorija;
import rs.aleph.android.example12.activities.activity.aktivites.model.Sastojci;

// Each activity extends Activity class
public class SecondActivity extends Activity {

    private int position = 0;
    private static final int CAMERA_REQUEST_CODE = 10;
    private static final int PERMISSIONS_REQUEST_INTERNET = 0;

    Jelo j1 = new Jelo(0,"cevapi.jpg","Cebavi","meso",200, 750);
    Jelo j2 = new Jelo(1,"sarma.jpg","Sarma","mleveno meso u kupusu",200, 750);


    Kategorija k1 = new Kategorija(0, "Rostilj");
    Kategorija k2 = new Kategorija(1, "Kuvana Jela");

    Sastojci s1 = new Sastojci(0, "svinjetina i govedina");
    Sastojci s2 = new Sastojci(1,"mleveno meso i kiseo kupus");


    // onCreate method is a lifecycle method called when he activity is starting
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Each lifecycle method should call the method it overrides
        super.onCreate(savedInstanceState);
        // setContentView method draws UI
        setContentView(R.layout.activity_second);

        j1.getKategorija().add(k1);
        k1.setJelo(j1);

        j2.getKategorija().add(k2);
        k2.setJelo(j2);

        k1.getSastojici().add(s1);
        s1.setKategorija(k1);

        k2.getSastojici().add(s2);
        s2.setKategorija(k2);


        // Shows a toast message (a pop-up message)
        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onCreate()", Toast.LENGTH_SHORT);
        toast.show();

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.INTERNET) != PackageManager.PERMISSION_GRANTED) {

            // PERMISSIONS_REQUEST_INTERNET is an app-defined int constant.
            // The callback method gets the result of the request.
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.INTERNET}, PERMISSIONS_REQUEST_INTERNET);

        } else {

            // Loads an URL into the WebView
            String URL = getIntent().getStringExtra("URL");
            if (!URL.trim().equalsIgnoreCase("")) {
                WebView myWebView = (WebView) findViewById(R.id.pageInfo);
                myWebView.getSettings().setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new MyWebViewClient());
                myWebView.loadUrl(URL.trim());
            }

        }

    }


    // onStart method is a lifecycle method called after onCreate (or after onRestart when the
    // activity had been stopped, but is now again being displayed to the user)
    @Override
    protected void onStart() {
        super.onStart();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onStart()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onRestart method is a lifecycle method called after onStop when the current activity is
    // being re-displayed to the user
    @Override
    protected void onRestart() {
        super.onRestart();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onRestart()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onResume method is a lifecycle method called after onRestoreInstanceState, onRestart, or
    // onPause, for your activity to start interacting with the user
    @Override
    protected void onResume() {
        super.onResume();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onResume()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onPause method is a lifecycle method called when an activity is going into the background,
    // but has not (yet) been killed
    @Override
    protected void onPause() {
        super.onPause();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onPause()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onStop method is a lifecycle method called when the activity are no longer visible to the user
    @Override
    protected void onStop() {
        super.onStop();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onStop()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onDestroy method is a lifecycle method that perform any final cleanup before an activity is destroyed
    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onDestroy()", Toast.LENGTH_SHORT);
        toast.show();
    }
//    public void btnStartActivityClicked (View view){
//        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
//        // startActivity method starts an activity
//        startActivity(intent);
//    }
    public void btnOpenCameraClicked (View view) {
        if (ContextCompat.checkSelfPermission(this,Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, CAMERA_REQUEST_CODE);
        }else{
            invokeCamera();
        }
    }


    private void invokeCamera() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        startActivity(takePictureIntent);
    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            return false;
        }
    }

    // This method is invoked asynchronously for every call on requestPermissions
    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        super.onRequestPermissionsResult(requestCode,permissions,grantResults);
        switch (requestCode) {
            case PERMISSIONS_REQUEST_INTERNET: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    // Permission was granted

                    // Loads an URL into the WebView
                    String URL = getIntent().getStringExtra("URL");
                    if (!URL.trim().equalsIgnoreCase("")) {
                        WebView myWebView = (WebView) findViewById(R.id.pageInfo);
                        myWebView.getSettings().setJavaScriptEnabled(true);
                        myWebView.setWebViewClient(new MyWebViewClient());
                        myWebView.loadUrl(URL.trim());
                    }

                } else {

                    // Permission denied
                }
                return;
            }
            case CAMERA_REQUEST_CODE:{

                    if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                        invokeCamera();
                    }else{
                        Toast.makeText(this, getString(R.string.unable_to_invoke_camera), Toast.LENGTH_LONG).show();
                    }
                return;

            }
            // other 'case' lines to check for other permissions this app might request
        }
    }


}
