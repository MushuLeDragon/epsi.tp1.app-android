package b3.epsi.tp1.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import b3.epsi.tp1.R;
import b3.epsi.tp1.models.GeometryLayer;
import b3.epsi.tp1.models.RectangleGeo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _geometryLayer = (GeometryLayer) findViewById(R.id.geometry_layer);

        _geometryLayer.addRectangle(new RectangleGeo(100, 200));
        _geometryLayer.addRectangle(new RectangleGeo(50, 400));

        public void drawRect(View button) {
        int witdth = getIntegerFromField(R.id.width_field);
        int height = getIntegerFromField(R.id.height_field);


            RectangleGeo newRect = new RectangleGeo(value, 100);

        }

    private int getIntegerFromField(int fieldId) {
        EditText field = (EditText) findViewById(R.id.width_field);
        String txtValue = field.getText().toString();
        int value = 0;
        try {
            value = Integer.parseInt(txtValue);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return value;
    }


    public void clearUp(View button) {
            _geometryLayer.clearRectangleList();
        }





    }
}
