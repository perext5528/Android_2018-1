package com.example.aventus.touchevent;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    protected class MyView extends View {
        int x=100, y=100;
        String str;
        public MyView(Context context){
            super(context);
            setBackgroundColor(Color.YELLOW);
        }
        protected void onDraw(Canvas canvas){
            Paint paint = new Paint();
            paint.setColor(Color.RED);
            canvas.drawCircle(x,y,100,paint);
            paint.setTextSize(50);
            canvas.drawText("액션의 종류 : "+str,0,100,paint);

        }
        public boolean onTouchEvent(MotionEvent event){
            x=(int)event.getX();
            y=(int)event.getY();
            if(event.getAction()==MotionEvent.ACTION_DOWN)
                str="Action_Down";
            if(event.getAction()==MotionEvent.ACTION_MOVE)
                str="Action_Move";
            if(event.getAction()==MotionEvent.ACTION_UP)
                str="Action_Up";
            invalidate();
            return true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       MyView w = new MyView(this);
       setContentView(w);
    }
}
