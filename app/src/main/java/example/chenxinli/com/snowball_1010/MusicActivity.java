package example.chenxinli.com.snowball_1010;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by ts on 2016-10-10.
 */
public class MusicActivity extends Activity {
    private Context mMusicContext;
    private ArrayList<MusicDatas> mMusicList;
    private DisplayManager mDisplayManager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        getMusicDatas();
        mMusicContext = this;
        mMusicList = getMusicDatas();

        ListView listView =(ListView) findViewById(R.id.listview_music);
        MusicAdapter musicAdapter = new MusicAdapter(mMusicContext,mMusicList);
        listView.setAdapter(musicAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Log.d("TAG", "i = " + i);
                Intent intent =  new Intent(); //创建意图
                intent.setClass(mMusicContext,MusicPlayActivity.class);//intent 中设置 做什么  跳转的Activity
                mMusicContext.startActivity(intent); //intent 告诉系统
            }
        });
    }

    public ArrayList<MusicDatas> getMusicDatas(){
        ArrayList<MusicDatas> mMusicList = new ArrayList<MusicDatas>();
        mMusicList.add(new MusicDatas("歌曲一"));
        mMusicList.add(new MusicDatas("歌曲二"));
        mMusicList.add(new MusicDatas("歌曲三"));
        mMusicList.add(new MusicDatas("歌曲四"));
        return mMusicList;
    }


    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void switchToMusic(View v){
        Toast.makeText(this,"切屏", Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_music_play);
        mDisplayManager = (DisplayManager)getSystemService(Context.DISPLAY_SERVICE);
        String displayCategory = DisplayManager.DISPLAY_CATEGORY_PRESENTATION;
        Display[] displays = mDisplayManager.getDisplays(displayCategory); //获取 所有的显示
        DemoPresentation presentation =  new DemoPresentation(this,displays[0]); //创建 自定义 Presentation
        presentation.show(); //显示
    }
}
