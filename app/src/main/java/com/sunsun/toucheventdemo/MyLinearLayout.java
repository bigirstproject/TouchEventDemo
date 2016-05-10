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
<<<<<<< HEAD
public class MyLinearLayout extends FrameLayout implements View.OnClickListener, View.OnLongClickListener, GestureDetector.OnGestureListener {

    private final static String TAG = "TouchEvent";
    private GestureDetector mGestureDetector;
=======
public class MyLinearLayout extends FrameLayout implements View.OnClickListener, View.OnLongClickListener,View.OnTouchListener, GestureDetector.OnGestureListener {

    private final static String TAG = "TouchEvent";
    private  GestureDetector mGestureDetector;
>>>>>>> 0a7fdb62c95796f070574c9259e86ae8a7f357c5

    public MyLinearLayout(Context context) {
        this(context, null);
    }

    public MyLinearLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
<<<<<<< HEAD
        mGestureDetector = new GestureDetector(context, this);
=======
        this.setOnTouchListener(this);
        mGestureDetector = new GestureDetector(context,this);
>>>>>>> 0a7fdb62c95796f070574c9259e86ae8a7f357c5
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
<<<<<<< HEAD
        mGestureDetector.onTouchEvent(ev);
        int action = ev.getAction();
=======
        int action = ev.getAction();

>>>>>>> 0a7fdb62c95796f070574c9259e86ae8a7f357c5
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
<<<<<<< HEAD
        boolean b = super.onInterceptTouchEvent(ev);
//        boolean b = true;
=======
        //boolean b = super.onInterceptTouchEvent(ev);
        boolean b = true;
>>>>>>> 0a7fdb62c95796f070574c9259e86ae8a7f357c5
        Log.v(TAG, "MyLinearLayout --onInterceptTouchEvent [" + action + "] test.................return: " + b);
        return b;

    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {

        int action = ev.getAction();
<<<<<<< HEAD
        boolean  b = super.onTouchEvent(ev);
//        boolean b = true;
=======
        //boolean  b = super.onTouchEvent(ev);
        boolean b = true;
>>>>>>> 0a7fdb62c95796f070574c9259e86ae8a7f357c5
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
<<<<<<< HEAD
    public boolean onDown(MotionEvent e) {
        Log.v(TAG, "MyLinearLayout1 --onDown " + e + e.getAction());
=======
    public boolean onTouch(View v, MotionEvent event) {
        mGestureDetector.onTouchEvent(event);
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        Log.v(TAG, "MyLinearLayout --onDown " + e +e.getAction() );
>>>>>>> 0a7fdb62c95796f070574c9259e86ae8a7f357c5
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
<<<<<<< HEAD
        Log.v(TAG, "MyLinearLayout1 --onShowPress " + e + e.getAction());
=======
        Log.v(TAG, "MyLinearLayout --onShowPress " + e +e.getAction() );
>>>>>>> 0a7fdb62c95796f070574c9259e86ae8a7f357c5
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
<<<<<<< HEAD
        Log.v(TAG, "MyLinearLayout1 --onSingleTapUp " + e + e.getAction());
=======
        Log.v(TAG, "MyLinearLayout --onSingleTapUp " + e +e.getAction() );
>>>>>>> 0a7fdb62c95796f070574c9259e86ae8a7f357c5
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
<<<<<<< HEAD
        Log.v(TAG, "MyLinearLayout1 --onScroll  e1  = " + e1 + "  e2 = " + e2 + " distanceX = " + distanceX + " distanceY = " + distanceY);
=======
        Log.v(TAG, "MyLinearLayout --onScroll " );
>>>>>>> 0a7fdb62c95796f070574c9259e86ae8a7f357c5
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
<<<<<<< HEAD
        Log.v(TAG, "MyLinearLayout1 --onLongPress " + e + e.getAction());
=======
        Log.v(TAG, "MyLinearLayout --onLongPress " + e +e.getAction() );
>>>>>>> 0a7fdb62c95796f070574c9259e86ae8a7f357c5
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
<<<<<<< HEAD
        Log.v(TAG, "MyLinearLayout1 --onFling ");
=======
        Log.v(TAG, "MyLinearLayout --onFling ");
>>>>>>> 0a7fdb62c95796f070574c9259e86ae8a7f357c5
        return false;
    }
}
