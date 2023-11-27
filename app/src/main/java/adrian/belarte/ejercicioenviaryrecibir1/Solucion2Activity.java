package adrian.belarte.ejercicioenviaryrecibir1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Solucion2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solucion2);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String respuesta = null;
        int res;

        if(bundle.containsKey("LETRAS")){
            respuesta = bundle.getString("LETRAS");
            res = respuesta.length();
            Toast.makeText(this,"Letras: "+res, Toast.LENGTH_LONG);
        }else{
            if(bundle.containsKey("PALABRAS"))
        }
    }
}