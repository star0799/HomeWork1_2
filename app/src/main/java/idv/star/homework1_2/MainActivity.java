package idv.star.homework1_2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
   private SeekBar sbr;
    private SeekBar sbg;
    private SeekBar sbb;
   private RelativeLayout relativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews(){
        relativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);
        sbr=(SeekBar)findViewById(R.id.sbr);
        sbg=(SeekBar)findViewById(R.id.sbg);
        sbb=(SeekBar)findViewById(R.id.sbb);
        sbr.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
                relativeLayout.setBackgroundColor(Color.rgb(progress, 0,0 ));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, getString(R.string.rvl) +" "+ seekBar.getProgress(), Toast.LENGTH_SHORT).show();
            }
        });

        sbg.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
                relativeLayout.setBackgroundColor(Color.rgb(0, progress, 0));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, getString(R.string.gvl) +" "+ seekBar.getProgress(), Toast.LENGTH_SHORT).show();
            }
        });
        sbb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
                relativeLayout.setBackgroundColor(Color.rgb(0, 0, progress));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, getString(R.string.bvl) +" "+ seekBar.getProgress(), Toast.LENGTH_SHORT).show();
            }
        });
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
