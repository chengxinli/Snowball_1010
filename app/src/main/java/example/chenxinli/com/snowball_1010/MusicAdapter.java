package example.chenxinli.com.snowball_1010;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ts on 2016-10-10.
 */
public class MusicAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<MusicDatas> mMusicList;

    public MusicAdapter(Context mContext, ArrayList<MusicDatas> mMusicList) {
        this.mContext = mContext;
        this.mMusicList = mMusicList;
    }

    @Override
    public int getCount() {
        return mMusicList.size();
    }

    @Override
    public Object getItem(int i) {
        return mMusicList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        MusicDatas musicDatas = mMusicList.get(i);
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view1 = layoutInflater.inflate(R.layout.listview_music_item,null);
        TextView tvMusicName = (TextView)view1.findViewById(R.id.listview_item_tv_musicName);
        tvMusicName.setText(musicDatas.getMusicName());
        return view1;
    }
}
