package com.kwcapp.mycustomview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;

import androidx.annotation.Nullable;

public class OwnTextView extends androidx.appcompat.widget.AppCompatTextView {

  private Paint backgroundPaint;

  public OwnTextView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);

    backgroundPaint = new Paint();
    backgroundPaint.setColor(0xffff0000);
    backgroundPaint.setStyle(Paint.Style.FILL);
  }

  @Override
  protected void onDraw(Canvas canvas) {
    canvas.drawRect(0,0,getWidth(),getHeight(),backgroundPaint);
    super.onDraw(canvas);
  }
}