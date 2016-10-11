package example.chenxinli.com.snowball_1010;

import android.app.Activity;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

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
        CallAdapter callAdapter = new CallAdapter(mNumContext,mCallList());
        mGridView.setAdapter(callAdapter);

//        et = (EditText) findViewById(R.id.gridview_call);
//        findViewById(R.id.gridview_call);
//        findViewById(R.id.call_item_bt);
    }

    private void init() {
        mGridView =(GridView) findViewById(R.id.gridview_call);
        mNumContext = CallActivity.this;
    }
    public ArrayList<CallDatas> mCallList(){
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

    public void Call(View view){
        Toast.makeText(this,"点击", Toast.LENGTH_LONG).show();

    }


}
