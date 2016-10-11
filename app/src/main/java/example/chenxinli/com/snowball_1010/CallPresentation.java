package example.chenxinli.com.snowball_1010;

import android.annotation.TargetApi;
import android.app.Presentation;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;

/**
 * Created by ts on 2016-10-11.
 */
@TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
public class CallPresentation extends Presentation {
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public CallPresentation(Context outerContext, Display display) {
        super(outerContext, display);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public CallPresentation(Context outerContext, Display display, int theme) {
        super(outerContext, display, theme);
    }
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.presentation_call);
    }
}
