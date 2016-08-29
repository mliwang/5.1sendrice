package cn.itcast.sendrice;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       
    }
    public void click(View v) {
		Intent intent=new Intent();
		intent.setAction("xi.send.rice");
		sendOrderedBroadcast(intent, null, null, null, 1, "习大大给每个村民发了千斤大米",null );
		

	}

}
