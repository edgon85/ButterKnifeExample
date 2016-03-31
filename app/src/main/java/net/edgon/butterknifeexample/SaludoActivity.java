package net.edgon.butterknifeexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class SaludoActivity extends AppCompatActivity {

    @Bind(R.id.edit_text_saludo) TextView txtSaludo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        ButterKnife.bind(this);

        Bundle bundle = this.getIntent().getExtras();
        txtSaludo.setText("Hola " + bundle.getString("NOMBRE"));
       // txtSaludo.setText(getString(R.string.hola, bundle.getString("NOMBRE")));

    }
}
