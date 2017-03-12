package com.momo.aksu.getircontest.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.momo.aksu.getircontest.data.model.Element;

import java.util.List;

public class DrawingView extends View {
    private Paint drawPaint;
    private List<Element> elements;

    public DrawingView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public void initialize(List<Element> e) {
        elements = e;
        setupPaint();
        postInvalidate();
    }

    private void setupPaint() {
        drawPaint = new Paint();
        drawPaint.setAntiAlias(true);
        drawPaint.setStrokeWidth(5);
        drawPaint.setStyle(Paint.Style.STROKE);
        drawPaint.setStrokeJoin(Paint.Join.ROUND);
        drawPaint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(elements != null) {
            for (Element e : elements) {
                drawPaint.setColor(Color.parseColor("#" + e.getColor()));

                if("circle".equals(e.getType())) {
                    canvas.drawCircle(e.getXPosition(), e.getYPosition(), e.getR(), drawPaint);
                }

                if("rectangle".equals(e.getType())) {
                    canvas.drawRect(e.getXPosition(), e.getYPosition(), e.getWidth(), e.getHeight(), drawPaint);
                }
            }
        }
    }
}
