package example.chenxinli.com.snowball_1010;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Toast;

/**
 * Created by ts on 2016-10-10.
 */
public class MusicPlayActivity extends Activity{

//    private DisplayManager mDisplayManager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_play);
    }
    public void play(View v){
        Toast.makeText(this,"play", Toast.LENGTH_LONG).show();
    }
    public void pause(View v){
        Toast.makeText(this,"pause", Toast.LENGTH_LONG).show();
    }
    public void stop(View v){
        Toast.makeText(this,"stop", Toast.LENGTH_LONG).show();
    }
//    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
//    public void switchScreen(View v){
//        Toast.makeText(this,"切屏", Toast.LENGTH_LONG).show();
//        setContentView(R.layout.activity_music_play);
//        mDisplayManager = (DisplayManager)getSystemService(Context.DISPLAY_SERVICE);
//        String displayCategory = DisplayManager.DISPLAY_CATEGORY_PRESENTATION;
//        Display[] displays = mDisplayManager.getDisplays(displayCategory); //获取 所有的显示
//        DemoPresentation presentation =  new DemoPresentation(this,displays[0]); //创建 自定义 Presentation
//        presentation.show(); //显示
//    }
}
