package com.blogspot.odooplay.android_00018_contador;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {
    public int contador;
    TextView textoResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoResultado=(TextView)findViewById(R.id.contadorTexto);
        contador=0;

    }
    public void incrementaContador(View vista){
        contador++;
        mostrarResultado();
    }
    public void restaContador(View vista){
        contador--;
        mostrarResultado();

    }
    public void reseteaContador(View vista){
        contador=0;
        mostrarResultado();

    }
    public void mostrarResultado(){
        TextView textoResultado=(TextView)findViewById(R.id.contadorTexto);
        textoResultado.setText("" + contador); }
}
