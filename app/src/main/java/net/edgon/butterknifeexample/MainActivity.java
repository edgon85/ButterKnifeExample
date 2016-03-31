package net.edgon.butterknifeexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.edit_text) EditText txtNombre;
    @Bind(R.id.btn_aceptar) Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    @OnClick(R.id.btn_aceptar)
    public void clicked(){
        String nombre = txtNombre.getText().toString();

        if (TextUtils.isEmpty(nombre)){
            txtNombre.setError("Ingrese su nombre");
        }else{
           // Toast.makeText(this, nombre,Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(MainActivity.this,SaludoActivity.class);

            Bundle bundle = new Bundle();
            bundle.putString("NOMBRE",nombre);
            intent.putExtras(bundle);

            startActivity(intent);
        }

        txtNombre.setText("");
    }
}
