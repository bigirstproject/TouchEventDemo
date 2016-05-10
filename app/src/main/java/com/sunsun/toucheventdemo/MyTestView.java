package com.sunsun.toucheventdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
<<<<<<< HEAD
import android.view.GestureDetector;
=======
>>>>>>> 0a7fdb62c95796f070574c9259e86ae8a7f357c5
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/4/26.
 */
<<<<<<< HEAD
public class MyTestView extends TextView implements GestureDetector.OnGestureListener{

    public static final String TOUCH_EVENT = "TouchEvent";
    public static final String TAG = TOUCH_EVENT;
    private GestureDetector mGestureDetector;

    public MyTestView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mGestureDetector = new GestureDetector(context, this);
=======
public class MyTestView extends TextView {

    public static final String TAG = "TouchEvent";

    public MyTestView(Context context, AttributeSet attrs) {

        super(context, attrs);
>>>>>>> 0a7fdb62c95796f070574c9259e86ae8a7f357c5
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
<<<<<<< HEAD
        mGestureDetector.onTouchEvent(ev);
        int action = ev.getAction();
=======
        int action = ev.getAction();

>>>>>>> 0a7fdb62c95796f070574c9259e86ae8a7f357c5
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

<<<<<<< HEAD

    @Override
    public boolean onDown(MotionEvent e) {
        Log.v(TAG, "MyTestView1 --onDown " + e + e.getAction());
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        Log.v(TAG, "MyTestView1 --onShowPress " + e + e.getAction());
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        Log.v(TAG, "MyTestView1 --onSingleTapUp " + e + e.getAction());
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        Log.v(TAG, "MyTestView1 --onScroll  e1  = " + e1 + "  e2 = " + e2 + " distanceX = " + distanceX + " distanceY = " + distanceY);
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        Log.v(TAG, "MyTestView1 --onLongPress " + e + e.getAction());
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        Log.v(TAG, "MyTestView1 --onFling ");
        return false;
    }
=======
>>>>>>> 0a7fdb62c95796f070574c9259e86ae8a7f357c5
}