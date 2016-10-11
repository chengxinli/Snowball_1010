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
public class GridViewAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<GridViewDatas> list;

    public GridViewAdapter(Context mContext, ArrayList<GridViewDatas> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        GridViewDatas gridViewDatas = list.get(i);
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View v = layoutInflater.inflate(R.layout.gridview_item, null);
        TextView tvAppName = (TextView)v.findViewById(R.id.gridview_item_tv_appName);
        // Log.d("aaa","data=="+datas.getAppName());
        tvAppName.setText(gridViewDatas.getAppName());
        return v;
    }
}
