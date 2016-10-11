package example.chenxinli.com.snowball_1010;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * Created by ts on 2016-10-10.
 */
public class CallActivity extends Activity {

    private Context mNumContext;
    //private ArrayList<CallDatas> mCallList;
    private GridView mGridView;
    private EditText et;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        init();
        CallAdapter callAdapter = new CallAdapter(mNumContext, mCallList());

        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CallDatas callDatas = (CallDatas) view.getTag();
                if ("~".equals(callDatas.getNums())) {
                    //TODO 拨打电话

                } else if ("*".equals(callDatas.getNums())) {
                    //TODO 删除
                    String str = et.getText().toString();
                    if (null != str  ){
                        if ( str.length() > 1){
                            str = str.substring(0, str.length() - 1);
                        }else {
                            str = "";
                        }
                        et.setText(str);
                    }
                } else { //输入
                    String str = et.getText().toString();
                    str = str + callDatas.getNums();
                    et.setText(str);
                }

            }
        });
        mGridView.setAdapter(callAdapter);
    }

    private void init() {
        mNumContext = CallActivity.this;
        mGridView = (GridView) findViewById(R.id.gridview_call);
        et = (EditText) findViewById(R.id.et_input_number);
    }

    public ArrayList<CallDatas> mCallList() {
        ArrayList<CallDatas> mCallList = new ArrayList<CallDatas>();
        mCallList.add(new CallDatas("1"));
        mCallList.add(new CallDatas("2"));
        mCallList.add(new CallDatas("3"));
        mCallList.add(new CallDatas("4"));
        mCallList.add(new CallDatas("5"));
        mCallList.add(new CallDatas("6"));
        mCallList.add(new CallDatas("7"));
        mCallList.add(new CallDatas("8"));
        mCallList.add(new CallDatas("9"));
        mCallList.add(new CallDatas("~"));
        mCallList.add(new CallDatas("0"));
        mCallList.add(new CallDatas("*"));

        return mCallList;
    }


    //这个点击事件不要了
//    public void Call(View view){
//        Toast.makeText(this,"点击", Toast.LENGTH_LONG).show();
//
//    }


}
