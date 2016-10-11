package example.chenxinli.com.snowball_1010;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ts on 2016-10-10.
 */
public class CallAdapter extends BaseAdapter {

    private Context mNumContext;
    private ArrayList<CallDatas> mCallList;

    public CallAdapter(Context mNumContext, ArrayList<CallDatas> mCallList) {
        this.mNumContext = mNumContext;
        this.mCallList = mCallList;
    }

    @Override
    public int getCount() {
        return mCallList.size();
    }

    @Override
    public Object getItem(int i) {
        return mCallList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = LayoutInflater.from(mNumContext);

        CallDatas callDatas = mCallList.get(i);
        if (i == 9) {
            View vimage = layoutInflater.inflate(R.layout.call_image, null);
            ImageView imageView = (ImageView) vimage.findViewById(R.id.call_item_iv);
            imageView.setBackgroundResource(R.drawable.call);
            vimage.setTag(callDatas);
            return vimage;
        } else if (i == 11) {
            View vimage = layoutInflater.inflate(R.layout.call_image, null);
            ImageView imageView = (ImageView) vimage.findViewById(R.id.call_item_iv);
            imageView.setBackgroundResource(R.drawable.holdup);
            vimage.setTag(callDatas);
            return vimage;
        } else {
            View v = layoutInflater.inflate(R.layout.call_item, null);
            TextView button = (TextView) v.findViewById(R.id.call_item_bt);
            // Log.d("aaa","data=="+datas.getAppName());
            button.setText(callDatas.getNums());
            v.setTag(callDatas);
            return v;
        }
    }
}
