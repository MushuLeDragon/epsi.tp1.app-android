package b3.epsi.tp1.models;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;



public class GeometryLayer extends View {

    private ArrayList<RectangleGeo> _rectangleList = new ArrayList<>();
    private Paint _paint;


    public GeometryLayer(Context context) {
        super(context);
    }

    public GeometryLayer(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public GeometryLayer(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public GeometryLayer(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void addRectangle(RectangleGeo rect) {
        _rectangleList.add(rect);
        invalidate(0, 0, rect.getLargeur(), rect.getLongueur());
    }

    public void clearRectangleList() {
        _rectangleList.clear();
        invalidate();
    }

    private void getPaint() {
        if (_paint ==null) {
            _paint = new Paint();
            _paint.setStyle(Paint.Style.FILL_AND_STROKE);
            _paint.setColor(Color.BLUE);
        }
        return _paint;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = getPaint();

        for (RectangleGeo r : _rectangleList) {
            canvas.drawRect(0,0,r.getLargeur(), r.getLongueur(), pinceau);
        }

    }
}
