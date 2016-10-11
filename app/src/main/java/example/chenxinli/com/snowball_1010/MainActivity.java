package example.chenxinli.com.snowball_1010;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Context mContext;
    private ArrayList<GridViewDatas> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getGridViewDatas();
        mContext = this;
        list = getGridViewDatas();

        GridView gridview =(GridView)findViewById(R.id.gridview_main);
        GridViewAdapter gridViewAdapter = new GridViewAdapter(mContext,list);
        gridview.setAdapter(gridViewAdapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("TAG", "i = " + i);
                Intent intent =  new Intent();
                switch (i){
                    case 0:
                        Intent intent1 =  new Intent(); //创建意图//创建意图
                        intent1.setClass(mContext,MusicActivity.class);//intent 中设置 做什么  跳转的Activity
                        mContext.startActivity(intent1); //intent 告诉系统
                        break;
                    case 1:
                        Intent intent2 =  new Intent(); //创建意图
                        intent2.setClass(mContext,CallActivity.class);//intent 中设置 做什么  跳转的Activity
                        mContext.startActivity(intent2); //intent 告诉系统
                        break;
                }
//                if(i == 0){
//                    Intent intent =  new Intent(); //创建意图
//                    intent.setClass(mContext,MusicActivity.class);//intent 中设置 做什么  跳转的Activity
//                    mContext.startActivity(intent); //intent 告诉系统
//                }
            }
        });

    }

    public ArrayList<GridViewDatas> getGridViewDatas(){
        ArrayList<GridViewDatas> list = new ArrayList<GridViewDatas>();
        list.add(new GridViewDatas("音乐"));
        list.add(new GridViewDatas("电话"));
//        list.add(new GridViewDatas("运动"));
//        list.add(new GridViewDatas("新闻"));
        return list;
    }
}
