package com.sunsun.toucheventdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by Administrator on 2016/4/26.
 */
public class MyLinearLayout extends FrameLayout implements View.OnClickListener, View.OnLongClickListener, GestureDetector.OnGestureListener {

    private final static String TAG = "TouchEvent";
    private GestureDetector mGestureDetector;

    public MyLinearLayout(Context context) {
        this(context, null);
    }

    public MyLinearLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mGestureDetector = new GestureDetector(context, this);
    }

    public void onClick(View v) {
        Log.v(TAG, "MyLinearLayout onClick [" + "] test.................view:" + v.getId());
    }

    @Override
    public boolean onLongClick(View v) {
        boolean b = true;
        Log.v(TAG, "MyLinearLayout onLongClick [" + "] test.................view:" + v.getId() + "return :" + b);
        return true;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        mGestureDetector.onTouchEvent(ev);
        int action = ev.getAction();
        switch (action) {

            case MotionEvent.ACTION_DOWN:

                Log.d(TAG, "MyLinearLayout --dispatchTouchEvent action:ACTION_DOWN");

                break;

            case MotionEvent.ACTION_MOVE:

                Log.d(TAG, "MyLinearLayout --dispatchTouchEvent action:ACTION_MOVE");
                return false;
            //break;

            case MotionEvent.ACTION_UP:

                Log.d(TAG, "MyLinearLayout --dispatchTouchEvent action:ACTION_UP");

                break;

            case MotionEvent.ACTION_CANCEL:

                Log.d(TAG, "MyLinearLayout --dispatchTouchEvent action:ACTION_CANCEL");

                break;

        }
//          Log.v(TAG ,  "dispatchTouchEvent "+super.dispatchTouchEvent(ev));
        boolean b = super.dispatchTouchEvent(ev);
//        boolean b = false;
        Log.v(TAG, "MyLinearLayout --dispatchTouchEvent [" + action + "] test.................return:" + b);
        return b;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {

        int action = ev.getAction();

        switch (action) {

            case MotionEvent.ACTION_DOWN:

                Log.d(TAG, "MyLinearLayout --onInterceptTouchEvent action:ACTION_DOWN");

                break;

            case MotionEvent.ACTION_MOVE:

                Log.d(TAG, "MyLinearLayout --onInterceptTouchEvent action:ACTION_MOVE");

                break;

            case MotionEvent.ACTION_UP:

                Log.d(TAG, "MyLinearLayout --onInterceptTouchEvent action:ACTION_UP");

                break;

            case MotionEvent.ACTION_CANCEL:

                Log.d(TAG, "MyLinearLayout --onInterceptTouchEvent action:ACTION_CANCEL");

                break;

        }
        boolean b = super.onInterceptTouchEvent(ev);
//        boolean b = true;
        Log.v(TAG, "MyLinearLayout --onInterceptTouchEvent [" + action + "] test.................return: " + b);
        return b;

    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {

        int action = ev.getAction();
        boolean  b = super.onTouchEvent(ev);
//        boolean b = true;
        switch (action) {

            case MotionEvent.ACTION_DOWN:

                Log.d(TAG, "MyLinearLayout---onTouchEvent action:ACTION_DOWN");

                break;

            case MotionEvent.ACTION_MOVE:

                Log.d(TAG, "MyLinearLayout---onTouchEvent action:ACTION_MOVE");

                break;

            case MotionEvent.ACTION_UP:

                Log.d(TAG, "MyLinearLayout---onTouchEvent action:ACTION_UP");

                break;

            case MotionEvent.ACTION_CANCEL:

                Log.d(TAG, "MyLinearLayout---onTouchEvent action:ACTION_CANCEL");

                break;

        }

        Log.v(TAG, "MyLinearLayout --onTouchEvent [" + action + "] test.................return: " + b);
        return b;
    }


    @Override
    public boolean onDown(MotionEvent e) {
        Log.v(TAG, "MyLinearLayout1 --onDown " + e + e.getAction());
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        Log.v(TAG, "MyLinearLayout1 --onShowPress " + e + e.getAction());
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        Log.v(TAG, "MyLinearLayout1 --onSingleTapUp " + e + e.getAction());
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        Log.v(TAG, "MyLinearLayout1 --onScroll  e1  = " + e1 + "  e2 = " + e2 + " distanceX = " + distanceX + " distanceY = " + distanceY);
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        Log.v(TAG, "MyLinearLayout1 --onLongPress " + e + e.getAction());
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        Log.v(TAG, "MyLinearLayout1 --onFling ");
        return false;
    }
}
