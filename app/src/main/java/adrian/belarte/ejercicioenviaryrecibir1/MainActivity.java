package adrian.belarte.ejercicioenviaryrecibir1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //declarar variables
    private EditText txtFrase;
    private Button btnPalabras;
    private Button btnCaracteres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarVista();

        btnPalabras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String frase = txtFrase.getText().toString();
                if(txtFrase.getText().toString().length()> 0){
                    int contPalabras = frase.split(" ").length;
                    String mensaje = "El numero de palabras es "+ contPalabras;
                    crearNuevaActividad(mensaje);
                }else{
                    Toast.makeText(MainActivity.this,"Escribe algo!!", Toast.LENGTH_LONG);
                }
            }
        });
        btnCaracteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String frase = txtFrase.getText().toString();
                if(txtFrase.getText().toString().length()> 0){
                    int contPalabras = frase.trim().length();
                    String mensaje = "El numero de Caracteres es "+ contPalabras;
                    crearNuevaActividad(mensaje);
                }else{
                    Toast.makeText(MainActivity.this,"Escribe algo!!", Toast.LENGTH_LONG);
                }
            }
        });
    }
    private void crearNuevaActividad(String mensaje){
        Intent intent = new Intent(MainActivity.this, MostrarResultadoActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("MSG",mensaje);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    private void inicializarVista() {
        txtFrase = findViewById(R.id.txtFraseMain);
        btnPalabras = findViewById(R.id.btnPalabrasMain);
        btnCaracteres = findViewById(R.id.btnCaracteresMain);
    }
}