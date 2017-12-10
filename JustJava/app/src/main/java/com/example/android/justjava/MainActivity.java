package com.example.android.justjava;
/**
 * IMPORTANT: Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 * package com.example.android.justjava; 
 *
 */


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    TextView cantidadTextView;
    TextView precioTextView;
    int cantidad;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cantidadTextView = (TextView) findViewById(R.id.quantity_text_view);
        precioTextView = (TextView) findViewById(R.id.price_text_view);
        cantidad = Integer.parseInt(cantidadTextView.getText().toString());
    }

    public void submitOrder(View view){
        actualizarPrecio();
    }

    public void increment(View view) {
        incrementOrden();
    }

    public void decrement(View view) {
        decrementOrden();
    }


    private void incrementOrden(){
        cantidad++;
        cantidadTextView.setText("" + cantidad);
    }

    private void decrementOrden(){
        if(cantidad != 0) {
            cantidad--;
        }
        cantidadTextView.setText("" + cantidad);
    }

    private void actualizarPrecio(){
        precioTextView.setText("" + cantidad*5 + "€");
    }
}
