package com.keegan.android.orientationv2;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    protected void onCreate( Bundle savedInstanceState ) {
        Log.w( "MainActivity", "Inside onCreate" );
        super.onCreate( savedInstanceState );
        Configuration config = getResources( ).getConfiguration( );
        modifyLayout( config );
    }

    public void onConfigurationChanged( Configuration newConfig ) {
        Log.w( "MainActivity", "Inside onConfigurationChanged" );
        super.onConfigurationChanged( newConfig );
        modifyLayout( newConfig );
    }

    public void modifyLayout( Configuration newConfig ) {
        Log.w( "MainActivity", "Inside modifyLayout" );
        if( newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE )
            setContentView( R.layout.activity_main_landscape );
        else if( newConfig.orientation == Configuration.ORIENTATION_PORTRAIT )
            setContentView( R.layout.activity_main );
    }
}
