package com.sunsun.toucheventdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/4/26.
 */
public class MyTestView extends TextView {

    public static final String TAG = "TouchEvent";

    public MyTestView(Context context, AttributeSet attrs) {

        super(context, attrs);
        Log.v(TAG, "MyTestView");
        /*this.setOnClickListener(this);
        this.setOnLongClickListener(this);*/
    }

    /*@Override
    public void onClick(View v) {
        Log.v(TAG ,  "MyTestView onClick [" + "] test.................view:"+v.getId() );
    }

    @Override
    public boolean onLongClick(View v) {
        boolean b = true;
        Log.v(TAG ,  "MyTestView onLongClick [" + "] test.................view:"+v.getId() +"return :"+b);
        return true;
    }
*/

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        int action = ev.getAction();

        switch (action) {

            case MotionEvent.ACTION_DOWN:

                Log.d(TAG, "MyTestView-- dispatchTouchEvent action:ACTION_DOWN");

                break;

            case MotionEvent.ACTION_MOVE:

                Log.d(TAG, "MyTestView-- dispatchTouchEvent action:ACTION_MOVE");

                break;

            case MotionEvent.ACTION_UP:

                Log.d(TAG, "MyTestView-- dispatchTouchEvent action:ACTION_UP");

                break;

            case MotionEvent.ACTION_CANCEL:

                Log.d(TAG, "MyTestView-- dispatchTouchEvent action:ACTION_CANCEL");

                break;

        }
        boolean b = super.dispatchTouchEvent(ev);
        //boolean b = true;
        Log.v(TAG ,  "MyTestView dispatchTouchEvent ["+action+ "] test.................return:"+b);
        return b;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        boolean b = super.onTouchEvent(ev);
        int action = ev.getAction();

        switch (action) {

            case MotionEvent.ACTION_DOWN:

                Log.d(TAG, "MyTestView-- ---onTouchEvent action:ACTION_DOWN");

                break;

            case MotionEvent.ACTION_MOVE:

                Log.d(TAG, "MyTestView-- ---onTouchEvent action:ACTION_MOVE");

                break;

            case MotionEvent.ACTION_UP:

                Log.d(TAG, "MyTestView-- ---onTouchEvent action:ACTION_UP");

                break;

            case MotionEvent.ACTION_CANCEL:

                Log.d(TAG, "MyTestView-- ---onTouchEvent action:ACTION_CANCEL");

                break;

        }

        //boolean b = true;
        Log.v(TAG ,  "MyTestView onTouchEvent ["+action+ "] test.................return:"+b);
        return b;

    }

}